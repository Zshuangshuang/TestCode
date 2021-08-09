package com.zss.webapps.dictionary;


import com.zss.standard.ServletException;
import com.zss.standard.http.HttpServlet;
import com.zss.standard.http.HttpServletRequest;
import com.zss.standard.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpReq, HttpServletResponse httpResp) throws ServletException, IOException {
        String words = httpReq.getParameter("english");
        String chinese = translate(words);

        httpResp.setContentType("text/html");
        PrintWriter printWriter = httpResp.getWriter();
        printWriter.printf("<h1>翻译服务</h1>\r\n");
        printWriter.printf("<p>%s 的意思是 %s</p>\r\n",words,chinese);
        printWriter.flush();
    }
    private String translate(String words){
        String chinese = "英语";
        return chinese;
    }
}
