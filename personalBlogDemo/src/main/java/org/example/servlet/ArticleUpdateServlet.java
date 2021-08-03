package org.example.servlet;


import org.example.dao.ArticleDao;
import org.example.model.Article;
import org.example.model.User;
import org.example.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //请求的格式是application/json，需要将其反序列化为一个Java对象
        InputStream inputStream = req.getInputStream();
        Article article = JSONUtil.deserialize(inputStream,Article.class);
        int num = ArticleDao.update(article);
        return null;
    }
}
