package com.student1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {


    static Connection con;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/application";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
