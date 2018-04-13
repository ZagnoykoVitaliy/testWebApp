package main;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class Main {

    private static Connection connection = null;
    private static String user = "postgres";
    private static String password = "root";
    private static String URL = "jdbc:postgresql://localhost:5432/postgres";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        String user = "postgres";
        String password = "root";
        String URL = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(URL, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM test_student WHERE name = ?");
        preparedStatement.setString(1, "Ihor");

        ResultSet resultSet = preparedStatement.executeQuery();


//        System.out.println(resultSet.getString("id") + " -> " + resultSet.getString("name") + " -> " + resultSet.getString("birth_date"));

    }
}
