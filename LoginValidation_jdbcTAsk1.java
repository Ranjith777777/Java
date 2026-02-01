package pratices.index;

import java.sql.*;
import java.util.Scanner;

public class LoginValidation_jdbcTAsk1 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/task";
    static final String USER = "root";
    static final String PASS = "ranjith"; // your MySQL password

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(" Login Successful");
            } else {
                System.out.println("Invalid Username or Password");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
