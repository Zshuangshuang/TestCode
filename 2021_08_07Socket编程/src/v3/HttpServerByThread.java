package v3;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HttpServerByThread implements Runnable{
    private static final String DOC_BASE = "E:\\JavaCode\\TestCode\\2021_08_07Socket编程\\docBase";
    private final Socket socket;

    //定义一个Map用来保存后缀名和contentType的对应关系
    private static final Map<String,String> map = new HashMap<>();
    static {
        map.put("html","text/html");
        map.put("txt","text/plain");
        map.put("js","application/javascript");
        map.put("jpg","image/jpeg");
    }

    public HttpServerByThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
       try{
               System.out.println("一条TCP连接已经建立");
               //处理解析请求
                InputStream inputStream = socket.getInputStream();
                Scanner scanner = new Scanner(inputStream,"UTF-8");
                //得到请求方法
                scanner.next();
                String path = scanner.next();
                String reqURI = path;
                scanner.nextLine();//读取http版本信息
                String query = "";
                if (reqURI.contains("?")){
                    int ret = path.indexOf('?');
                    reqURI = path.substring(0,ret);
                    query = path.substring(ret+1);
                }
                System.out.println(reqURI);

                //解析请求头
                Map<String,String> headers = new HashMap<>();
                String headerLine;
                //通过Scanner进行读取
                while (scanner.hasNextLine() && !(headerLine=scanner.nextLine()).isEmpty()){
                    //请求头用冒号分割
                    String[] part = headerLine.split(":");
                    String key = part[0].trim().toLowerCase();
                    String value = part[1].trim();
                    headers.put(key,value);
                }
                if ("/".equals(reqURI)){
                    path = "/index.html";
                }
                if (reqURI.equals("/set-cookie")){
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                    PrintWriter printWriter = new PrintWriter(writer);

                    printWriter.printf("HTTP/1.0 307 Temporary Redirect\r\n");
                    printWriter.printf("Set-Cookie: username=shuangshuangzou\r\n");
                    printWriter.printf("Location: profile\r\n");
                    printWriter.printf("\r\n");
                    printWriter.flush();
                } else if (reqURI.equals("/profile")){
                    String username = null;
                    //从请求头中获取cookie信息
                    String cookie = headers.getOrDefault("cookie","");
                    System.out.println("Cookie:"+cookie);
                    for (String cookieKV : cookie.split(";")){
                        String[] kv = cookieKV.split("=");
                        String key = kv[0];
                        String val = kv[1];
                        if ("username".equals(key)){
                            username = val;
                        }
                    }
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                    PrintWriter printWriter = new PrintWriter(writer);

                    printWriter.printf("HTTP/1.0 200 OK\r\n");
                    printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");
                    printWriter.printf("\r\n");
                    if (username != null){
                        printWriter.printf("<h1>当前用户是%s</h1>",username);
                    }else {
                        printWriter.write("请先登录账号");
                    }

                    printWriter.flush();

                } else if("/goodbye.html".equals(reqURI)){
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                    PrintWriter printWriter = new PrintWriter(writer);

                    String target = "中国";
                    for (String kv : query.split("&")){
                        if (kv.isEmpty()){
                            continue;
                        }
                        String[] parts = kv.split("=");
                        String key = URLDecoder.decode(parts[0],"UTF-8");
                        String value = URLDecoder.decode(parts[1],"UTF-8");
                        if ("target".equals(key)){
                            target = value;
                        }
                    }


                    printWriter.printf("HTTP/1.0 200 OK\r\n");
                    printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");
                    printWriter.printf("\r\n");
                    printWriter.printf("<h1>再见 %s</h1>",target);
                    printWriter.flush();
                }else {
                    //用户请求的静态资源的路径
                    String filePath = DOC_BASE + reqURI;
                    //判断资源是否存在
                    File resources = new File(filePath);
                    if (resources.exists()) {
                        //读取文件内容，写回响应体
                        OutputStream outputStream = socket.getOutputStream();
                        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                        PrintWriter printWriter = new PrintWriter(writer);
                        printWriter.flush();
                        String contentType = "text/html";
                        //找到路径对应的后缀名
                        if (path.contains(".")) {
                            int index = path.lastIndexOf(".");
                            String suffix = path.substring(index + 1);
                            contentType = map.getOrDefault(suffix, contentType);
                        }
                        if (contentType.startsWith("text/")) {
                            contentType = contentType + "; charset=utf-8";
                        }
                        printWriter.printf("HTTP/1.0 200 OK\r\n");
                        printWriter.printf("Content-Type: %s\r\n", contentType);
                        printWriter.printf("\r\n");
                        printWriter.flush();
                        //写回响应体
                        try (InputStream resourceInputStream = new FileInputStream(resources)) {
                            byte[] buffer = new byte[1024];
                            while (true) {
                                int len = resourceInputStream.read(buffer);
                                if (len == -1) {
                                    break;
                                }
                                outputStream.write(buffer, 0, len);
                            }
                            outputStream.flush();
                        }

                    } else {
                        OutputStream outputStream = socket.getOutputStream();
                        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                        PrintWriter printWriter = new PrintWriter(writer);


                        printWriter.printf("HTTP/1.0 404 Not Found\r\n");
                        printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");

                        printWriter.printf("\r\n");

                        printWriter.write("<h1>找不到对应资源</h1>");

                        printWriter.flush();
                    }
                }

       }catch (IOException  e){
           e.printStackTrace(System.out);
       }finally {
           try {
               socket.close();
               System.out.println("TCP连接已经释放");
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
}
