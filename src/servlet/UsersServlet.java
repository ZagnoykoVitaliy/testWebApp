package servlet;

import repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/students");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("/students.jsp");
//        req.getRequestDispatcher("/test").forward(req,resp);
        UserRepository userRepository = new UserRepository();
        try {
           List list = userRepository.findUsers();
           req.setAttribute("list",list);
           req.getRequestDispatcher("/users.jsp").forward(req,resp);
        } catch (SQLException e) {
            System.out.println("Looool!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        }

    }
}
