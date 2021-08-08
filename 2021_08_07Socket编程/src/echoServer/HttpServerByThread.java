package echoServer;

import java.io.*;

import java.net.Socket;

public class HttpServerByThread implements Runnable{
    private final Socket socket;

    public HttpServerByThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
       try{
               System.out.println("一条TCP连接已经建立");
               //暂时不做解析请求
               //直接返回响应
               OutputStream outputStream = socket.getOutputStream();
               Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
               PrintWriter printWriter = new PrintWriter(writer);
               Thread.sleep(10_000);
               //(1)写回首行
               printWriter.printf("HTTP/1.0 200 OK\r\n");
               //(2)写回头部信息
               //Content-Type对响应的影响
               //(1)text/html：默认将响应的页面渲染为html
               //(2)text/plain：以纯文本的形式将响应体内容渲染出来
               //(3)application/oct-stream：默认动作是询问下载选项
               printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");
               //(3)写回空行
               printWriter.printf("\r\n");
               //(4)写回响应体
               printWriter.write("<h1>我是响应体</h1>");
               //刷新，将数据写入TCP缓冲区
               printWriter.flush();

       }catch (IOException | InterruptedException e){
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
