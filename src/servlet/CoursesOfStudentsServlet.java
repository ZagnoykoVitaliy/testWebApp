package servlet;

import repository.StudentRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/coursesofstudent")
public class CoursesOfStudentsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentRepository studentRepository = new StudentRepository();
        try {
            String name = req.getParameter("name");
            System.out.println(name);
            List list = studentRepository.findCourses("Petro");
            req.setAttribute("list",list);
            req.getRequestDispatcher("/coursesofstudent.jsp").forward(req,resp);
        } catch (SQLException e) {
            System.out.println("CoursesOfStudentsServlet exception");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
