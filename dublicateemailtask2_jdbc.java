package pratices.index;
import java.sql.*;
import java.util.Scanner;
public class dublicateemailtask2_jdbc {
    static final String DB_URL = "jdbc:mysql://localhost:3306/task";
    static final String USER = "root";
    static final String PASS = "ranjith"; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {

          
            String checkSql = "SELECT email FROM email WHERE email = ?";
            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setString(1, email);

            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {
                System.out.println(" Email already exists. Try another.");
            } else {
             
                String insertSql = "INSERT INTO email (name, email) VALUES (?, ?)";
                PreparedStatement insertPs = con.prepareStatement(insertSql);
                insertPs.setString(1, name);
                insertPs.setString(2, email);

                int rows = insertPs.executeUpdate();

                if (rows > 0) {
                    System.out.println(" User registered successfully");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
