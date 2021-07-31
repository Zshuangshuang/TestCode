package org.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/loginJSON")
public class LoginJSONServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        //解析响应数据
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.printf("用户名 (%s)  密码 (%s) %n",name,password);

        PrintWriter pw = resp.getWriter();
        if ("abc".equals(name) && "123".equals(password)){
            pw.write("{\"success\": true}");
        }else {
            pw.write("{\"success\": false}");
        }
        pw.flush();
        pw.close();
    }
}
