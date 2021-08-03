package org.example.servlet;

import org.example.dao.ArticleDao;
import org.example.exception.AppException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-08-03 12:53
 */
@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String ids = req.getParameter("ids");
        int num = ArticleDao.delete(ids.split(","));

        return null;
    }
}
