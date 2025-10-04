import com.student1.Student;
import com.student1.StudentDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Start {
    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit student");
            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                //add student
                System.out.println("Enter name");
                String name = br.readLine();

                System.out.println("Enter phone number");
                String phone = br.readLine();

                System.out.println("Enter city");
                String city = br.readLine();

                //create student object to store

                Student st = new Student(name, phone, city);
                boolean ans = StudentDAO.insertStudent(st);
                if (ans) {
                    System.out.println("Student added successfully");
                } else {
                    System.out.println("Something went wrong...");
                }
                System.out.println(st);
            } else if (c == 2) {

            } else if (c == 3) {

            } else if (c == 4) {
                break;
            } else {

            }

        }

    }
}
