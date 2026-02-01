
	package pratices.index;

	import java.sql.*;
	import java.util.Scanner;
	public class storeprocedure_task2 {


	    static final String DB_URL = "jdbc:mysql://localhost:3306/task";
	    static final String USER = "root";
	    static final String PASS = "ranjith";

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Student ID to search: ");
	        int id = sc.nextInt();

	        String sql = "{CALL getStudentById(?)}";

	        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	             CallableStatement cs = conn.prepareCall(sql)) {

	           
	            cs.setInt(1, id);

	         
	            ResultSet rs = cs.executeQuery();

	            if (rs.next()) {
	                System.out.println("Student Details:");
	                System.out.println("ID: " + rs.getInt("id"));
	                System.out.println("Name: " + rs.getString("name"));
	                System.out.println("Marks: " + rs.getInt("marks"));
	            } else {
	                System.out.println("No student found with ID " + id);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        sc.close();
	    }
	}

