package com.zss.tomcat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpSever {
    public static void main(String[] args) throws IOException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket socket = serverSocket.accept();
            Runnable task = new RequestTask(socket);
            threadPool.execute(task);
        }
    }
}
