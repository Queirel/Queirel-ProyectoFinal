package config;

import java.sql.*;

public class Conexion {

    public String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
         
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/comision2160",
                    "fede",
                    "fede");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
        return connection;
    }

}
