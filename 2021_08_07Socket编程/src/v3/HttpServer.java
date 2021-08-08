package v3;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
   /* public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            //建立一条TCP连接
            Socket socket = serverSocket.accept();
            HttpServerByThread task = new HttpServerByThread(socket);
            new Thread(task).start();
        }

    }*/
    /**
     * 线程池版本
     * */
   public static void main(String[] args) throws IOException {
       ExecutorService threadPool = Executors.newFixedThreadPool(10);
       ServerSocket serverSocket = new ServerSocket(8080);
       while (true){
           Socket socket = serverSocket.accept();
           HttpServerByThread task = new HttpServerByThread(socket);
           threadPool.execute(task);
       }
   }
}
