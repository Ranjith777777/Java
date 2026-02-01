package pratices.index;

import java.sql.*;
import java.util.Scanner;

public class Storeprocedure_task1 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/task";
    static final String USER = "root";
    static final String PASS = "ranjith";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        String sql = "{CALL addStudent(?, ?, ?)}"; 

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             CallableStatement cs = conn.prepareCall(sql)) {

           
            cs.setInt(1, id);
            cs.setString(2, name);
            cs.setInt(3, marks);

           
            cs.execute();
            System.out.println("Student inserted successfully!");

          
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM Student1");
                System.out.println("\n--- All Students ---");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                                       ", Name: " + rs.getString("name") +
                                       ", Marks: " + rs.getInt("marks"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
