package org.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/loginUseSession")
public class LoginUseSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求相应编码以及响应数据类型
        req.setCharacterEncoding("UTF-8");//设置请求编码
        resp.setCharacterEncoding("UTF-8");//设置响应编码
        resp.setContentType("text/html");

        //解析数据
        String user = req.getParameter("username");
        String pw = req.getParameter("password");
        System.out.printf("用户名 (%s)  密码 (%s) %n",user,pw);

        //返回响应数据
        PrintWriter printWriter = resp.getWriter();
        if ("abc".equals(user) && "123".equals(pw)){
            //从客户端获取session信息，参数设置为false如果没有获取到session信息就返回Null
            //如果参数设置为true，没有获取到session信息浏览器就会自动创建一个session信息
            HttpSession session = req.getSession();
            session.setAttribute("username",user);
            session.setAttribute("password",pw);
            printWriter.println("登陆成功");
            printWriter.println("<h2> 欢迎"+user+"</h2>");
        }else {
            printWriter.println("登陆失败");
            printWriter.println("<h2>用户名或者密码错误</h2>");
        }

        printWriter.flush();//有缓冲的io操作一定要flush刷新缓冲区才能真正工作
        printWriter.close();//关闭资源
    }
}
