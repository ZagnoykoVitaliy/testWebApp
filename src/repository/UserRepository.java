package repository;

import connection.ConnectionDB;
import model.User;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
//    private static String user = "postgres";
//    private static String password = "root";
//    private static String URL = "jdbc:postgresql://localhost:5432/postgres";


    public List findUsers() throws SQLException, ClassNotFoundException {

       Connection connection = new ConnectionDB().getConnection();

        List<User> list = new ArrayList<User>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT  id_user, user_name, password FROM test_user");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            User newUser = new User();
            newUser.setId(resultSet.getLong("id_user"));
            newUser.setUser_name(resultSet.getString("user_name"));
            newUser.setPassword(resultSet.getString("password"));
            list.add(newUser);
        }
        System.out.println("UserRepository->FindStudent->ResultSet");
        return list;
    }


}
