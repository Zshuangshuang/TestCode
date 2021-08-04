package org.example.servlet;


import org.example.dao.UserDao;
import org.example.exception.AppException;
import org.example.model.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/register")
public class RegisterServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = UserDao.findUser(username);
        if (user == null){
            User newUser = new User();
            newUser.setUsername(username);
            newUser.setPassword(password);
            UserDao.addUser(newUser);
        }else {
            throw new AppException("RegisterError","用户已存在");
        }
        return null;
    }
}
