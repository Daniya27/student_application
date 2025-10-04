package com.student1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    public static boolean insertStudent(Student st) {

        boolean f = false;
        try {
			Connection connection = com.student1.CP.connect();
            String query = "insert into student1 values(?,?,?,?)";
            //prepare statement
            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, st.getStudent_Name());
            pstmt.setString(2, st.getStudent_Phone());
            pstmt.setString(3, st.getStudent_City());
            f = true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return f;
    }
}

