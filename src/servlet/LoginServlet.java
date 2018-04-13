package servlet;

import exception.ValidationException;
import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        LoginService loginService = new LoginService();

        try {
            loginService.login(login,password);
            resp.sendRedirect("/users");
        } catch (ValidationException e) {
            req.setAttribute("error", e.getMessage());
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}

