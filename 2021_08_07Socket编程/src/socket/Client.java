package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端直接使用Socket即可，需要绑定ip地址和端口号
        Socket socket = new Socket("127.0.0.1",8080);

        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream,"UTF-8");

        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        //向服务器发送数据
        printWriter.printf("客户端向服务器发送的内容\r\n");
        printWriter.flush();
        //接收服务端的响应数据
        String message = scanner.nextLine();
        System.out.println(message);
        socket.close();
    }
}
