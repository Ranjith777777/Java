package pratices.index;

import java.sql.*;

public class StudentDAOImpl implements Studentinterface{

    private static final String DB_URL = "jdbc:mysql://localhost:3306/task";
    private static final String USER = "root";
    private static final String PASS = "ranjith";

    @Override
    public void addStudent(Student s) { // parameter must be Student
        String sql = "INSERT INTO Student2(id, name, marks) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getMarks());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student inserted successfully: " + s.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
