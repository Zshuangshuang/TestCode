package org.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sen")
public class LoginSensitiveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession(false);
        if (session == null){
            System.out.println("session为null");
            resp.setStatus(403);

        }else {
            printWriter.write("登录成功");
            String username = (String)session.getAttribute("username");
            System.out.println("用户名为："+username);
        }
        printWriter.flush();
        printWriter.close();
    }
}
