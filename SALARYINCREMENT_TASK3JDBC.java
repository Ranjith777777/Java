package pratices.index;

import java.sql.*;
import java.util.Scanner;

public class SALARYINCREMENT_TASK3JDBC {

    static final String DB_URL = "jdbc:mysql://localhost:3306/task";
    static final String USER = "root";
    static final String PASS = "ranjith";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department name to increase salary: ");
        String department = sc.nextLine();

      
        String selectSql = "SELECT `id`, `name`, `department`, `salary` FROM `employee` WHERE `department` = ?";
       
        String updateSql = "UPDATE `employee` SET `salary` = `salary` * 1.10 WHERE `department` = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            
            System.out.println("\n--- Salaries BEFORE increment ---");
            try (PreparedStatement psSelect = conn.prepareStatement(selectSql)) {
                psSelect.setString(1, department);
                ResultSet rs = psSelect.executeQuery();
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                                       ", Name: " + rs.getString("name") +
                                       ", Department: " + rs.getString("department") +
                                       ", Salary: " + rs.getDouble("salary"));
                }
            }

           
            try (PreparedStatement psUpdate = conn.prepareStatement(updateSql)) {
                psUpdate.setString(1, department);
                int rowsUpdated = psUpdate.executeUpdate();
                System.out.println("\n" + rowsUpdated + " employee(s) salary updated in " + department + " department.");
            }

           
            System.out.println("\n--- Salaries AFTER increment ---");
            try (PreparedStatement psSelect = conn.prepareStatement(selectSql)) {
                psSelect.setString(1, department);
                ResultSet rs = psSelect.executeQuery();
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                                       ", Name: " + rs.getString("name") +
                                       ", Department: " + rs.getString("department") +
                                       ", Salary: " + rs.getDouble("salary"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
