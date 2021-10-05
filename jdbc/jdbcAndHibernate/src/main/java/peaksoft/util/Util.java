package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "12345kk";

    public static Connection connect() throws SQLException{
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the Postgresql server successfully!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
