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

@WebServlet(urlPatterns = "/students")
public class StudentsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentRepository studentRepository = new StudentRepository();
        try {
            List list = studentRepository.findStudents();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/students.jsp").forward(req,resp);
        } catch (SQLException e) {
            System.out.println("Oooops!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fuuuuck!");
        }
    }
}
