package org.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求体和响应体的编码方式
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //设置响应格式
        resp.setContentType("text/html");
        //解析请求数据
        String user = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.printf("用户名 (%s)  密码 (%s) %n",user,password);
        //返回响应数据
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("登陆成功");
        printWriter.println("<h3>欢迎"+user+"</h1>");
        //刷新缓冲区数据
        printWriter.flush();
        //关闭资源
        printWriter.close();
    }
}
