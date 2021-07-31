package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/loginJson")
public class LoginJsonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        String user = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.printf("用户名 (%s)  密码 (%s) %n",user,password);

        PrintWriter printWriter = resp.getWriter();
        if ("abc".equals(user) && "123".equals(password)){
            printWriter.println("{\"success\": true}");
        }else {
            printWriter.println("{\"success\": false}");
        }
        printWriter.flush();
        printWriter.close();

    }
}
