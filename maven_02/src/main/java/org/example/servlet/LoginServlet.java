package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//(1)继承HttpServlet
//(2)注解：小括号包含多个属性，属性名=属性值，多个之间用逗号隔开，属性名为value时可省略
//Servlet定义服务：路径必须以/开头，否则tomcat启动会报错
//注解中的/+访问路径和webapp下的login.html是两回事：注解中的访问路径对应映射的是后端服务，而webapp下对应的是相关前端页面的静态资源
//(3)重写http请求方法：doGet、doPost等
//客户端默认的请求方式是get，如果服务端写的请求方法只有post那么就会发生客户端有的请求方法在服务端没有，就会出现405报错
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    /**
     * 每次Servlet发起请求都会调用生命周期里面的Service()方法
     * 如果请求方法没有重写，就会调用父类方法里面的doXXX()对应的请求方法，就会返回405
     * 重写了方法就会将请求封装为一个req请求对象
     * */

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
        printWriter.println("登陆成功");
        printWriter.println("<h2> 欢迎"+user+"</h2>");
        printWriter.flush();//有缓冲的io操作一定要flush刷新缓冲区才能真正工作
        printWriter.close();//关闭资源
    }
}
