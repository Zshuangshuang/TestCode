package com.zss.standard.http;


import com.zss.standard.ServletRequest;

public interface HttpServletRequest extends ServletRequest {
    Cookie[] getCookies();

    String getHeader(String name);

    String getMethod();
    //Eg：localhost:8080/ss/login?target=哈哈
    //getContextPath()获取到的路径是/ss（应用上下文路径）
    String getContextPath();
    //getServletPath()获取到的路径是/login（对应的请求路径）
    String getServletPath();
    //getRequestURI()获取到的路径是/ss/login不包含queryString
    String getRequestURI();

    HttpSession getSession();

}
