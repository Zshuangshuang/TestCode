package com.zss.standard;


import java.io.IOException;
import java.io.PrintWriter;

public interface ServletResponse {
    PrintWriter getWriter() throws IOException;
    //设置响应Content-Type
    void setContentType(String type);
}
