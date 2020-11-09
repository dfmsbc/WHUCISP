package singleton;

import java.sql.*;

public class ChuShiConnection {
    //Static instance of connection, only one will ever exist
    private static Connection connection = null;

    //Returns single instance of connection
    public static Connection getConnection() {
        //If instance has not been created yet, create it
        if (ChuShiConnection.connection == null) {
            initConnection();
        }
        return ChuShiConnection.connection;
    }

    //Gets connection instance
    private static void initConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:MySQL://8.131.87.70:3306/whucisp";
            String user = "root";
            String pw = "20201109";
            ChuShiConnection.connection = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (Exception e) {
        }
    }
}