package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login301")
/**
 * 转发和重定向的区别：
 * (1)重定向会返回3xx开头的状态码+Location字段的响应头，表示要跳转的路径；浏览器会自动跳转
 * (2)转发仅发起一次请求，后端将转发的路径资源作为响应体返回
 * (3)重定向会发起两次请求，url会发生变化
 * (4)转发仅发起一次请求，且url不会发生变化
 *
 *
 * */
public class Login301Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        //解析数据
        String user = req.getParameter("username");
        String pw = req.getParameter("password");
        System.out.printf("用户名 (%s)  密码 (%s) %n",user,pw);
        if ("abc".equals(user) && "123".equals(pw)){
            //重定向：需要传入一个跳转的页面
            //使用sendRedirect会发起两次请求，并且在响应头中有location字段
            //会发起两次请求，第一次是请求/login301
            //第二次是浏览器自动请求提跳转到home.html,url会发生改变
            resp.sendRedirect("home.html");
        }else if("abc".equals(user)){
            //转发，url不会发生变化，且只发起一次请求
            req.getRequestDispatcher("home.html").forward(req,resp);
        }else {
            //返回响应数据
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("登陆失败");
            printWriter.println("<h2> 用户名"+user+"或密码错误</h2>");
            printWriter.flush();//有缓冲的io操作一定要flush刷新缓冲区才能真正工作
            printWriter.close();//关闭资源
        }


    }
}
