package org.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login301")
public class Login301Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        //解析数据
        String user = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.printf("用户名  (%s) 密码  (%s)%n",user,password);
        if ("abc".equals(user) && "123".equals(password)){
            resp.sendRedirect("home.html");
        }else {
            //返回响应数据
            PrintWriter printWriter = resp.getWriter();
            printWriter.write("<h3>用户名或者密码错误</h3>");
            printWriter.flush();
            printWriter.close();
        }

    }
}
