package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
//    private static String user = "postgres";
//    private static String password = "root";
//    private static String URL = "jdbc:postgresql://localhost:5432/postgres";



    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String user = "postgres";
        String password = "root";
        String URL = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(URL, user, password);
        return connection;
    }
}
