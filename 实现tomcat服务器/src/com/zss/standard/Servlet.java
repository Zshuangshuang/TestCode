package com.zss.standard;


import java.io.IOException;
/**
 * 模拟实现Servlet生命周期
 * */
public interface Servlet {
    void innit() throws ServletException;

    void service(ServletRequest req,ServletResponse resp) throws ServletException, IOException;

    void destroy();
}
