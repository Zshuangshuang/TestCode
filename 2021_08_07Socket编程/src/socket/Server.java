package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        //serverSocket是服务端负责三次握手前进行监听状态进行的相关操作，需要绑定一个端口号
        ServerSocket serverSocket = new ServerSocket(8080);
        //Socket对象表示一条建立好的TCP连接
        //TCP的三次握手在accept()方法中执行
        //通过Socket向操作系统要已经建立好的TCP连接
        //TCP协议是在OS中的一种针对于网络通信的约束能力
        //(1)目前的连接已经建立，OS直接返回
        //(2)否则就会一直等客户端来建立连接
       while (true){
           Socket socket = serverSocket.accept();
           System.out.println("已经建立一条TCP连接");
           //中间部分为socket通信进行的操作
           //可以通过inputStream来读取Client发送的应用层数据
           //InputStream,OutputStream默认的是字节流
           InputStream inputStream = socket.getInputStream();
           Scanner scanner = new Scanner(inputStream,"UTF-8");
           String line = scanner.nextLine();
           System.out.println(line);
           //可以通过将数据写入outputStream，经过OS内部的TCP机制发送给客户端
           OutputStream outputStream = socket.getOutputStream();
           Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
           PrintWriter printWriter = new PrintWriter(writer);
           printWriter.write("服务器响应回客户端的内容\r\n");
           printWriter.flush();
           //执行close方法相当于开始执行TCP的四次挥手操作
           socket.close();
       }

    }
}
