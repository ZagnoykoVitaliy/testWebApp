package repository;

import connection.ConnectionDB;
import model.Course;
import model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentRepository {

    public List findStudents() throws SQLException, ClassNotFoundException {
        Connection connection = new ConnectionDB().getConnection();

        List<Student> list = new ArrayList();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT id,name,birth_date FROM test_student");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setBirth_date(resultSet.getDate("birth_date"));
            list.add(student);
        }
        return list;
    }

    public List findCourses(String name) throws SQLException, ClassNotFoundException {
        Connection connection = new ConnectionDB().getConnection();

        List<Course> list = new ArrayList<>();

        PreparedStatement preparedStatement=connection.prepareStatement("SELECT test_course.name_course\n" +
                "FROM student_course\n" +
                "JOIN test_student ON student_course.id_student = test_student.id\n" +
                "JOIN test_course ON student_course.id_course = test_course.id\n" +
                "WHERE test_student.name = 'Valeriy'");
//        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            Course course = new Course();
            course.setId(resultSet.getInt("id"));
            course.setName_course("name_course");
            list.add(course);
        }
        return list;
    }
}
