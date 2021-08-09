package com.zss.tomcat;


import com.zss.standard.Servlet;
import com.zss.standard.ServletException;
import com.zss.standard.http.HttpServletRequest;
import com.zss.standard.http.HttpServletResponse;

import java.io.IOException;
import java.net.Socket;

public class RequestTask implements Runnable{
    private final Socket socket;

    public RequestTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //1.解析并且得到请求对象
        HttpServletRequest request = null;
        //2.得到响应对象
        HttpServletResponse response = null;
        //3.根据req.getContentPath获取应用的服务路径
        Context context = null;
        //4.根据req.getServletPath找到那个servlet去处理请求
        Servlet servlet = null;

        try {
            //5.调用servlet的service方法
            servlet.service(request,response);
            //6.根据resp中的数据发送http响应
            sendResponse(response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
