package com.zss.standard.http;


import com.zss.standard.Servlet;
import com.zss.standard.ServletException;
import com.zss.standard.ServletRequest;
import com.zss.standard.ServletResponse;

import java.io.IOException;

public abstract class HttpServlet implements Servlet {
    @Override
    public void innit() throws ServletException {

    }

    @Override
    public void destroy() {

    }
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        if (req instanceof HttpServletRequest && resp instanceof  HttpServletResponse){
            HttpServletRequest httpReq = (HttpServletRequest)req;
            HttpServletResponse httpResp = (HttpServletResponse)resp;
            service(httpReq,httpResp);
        }else {
            throw new ServletException("不支持非Http请求");
        }
    }

    protected void service(HttpServletRequest httpReq,HttpServletResponse httpResp)throws ServletException, IOException{
        if ("GET".equals(httpReq.getMethod())){
            doGet(httpReq,httpResp);
        }else {
            httpResp.sendError(405);
        }
    }
    protected void doGet(HttpServletRequest httpReq,HttpServletResponse httpResp)throws ServletException, IOException{
        httpResp.sendError(405);
    }
}
