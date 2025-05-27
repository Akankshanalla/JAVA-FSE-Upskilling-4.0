import java.sql.*;

public class StudentDAOTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            StudentDAO dao = new StudentDAO(conn);

            dao.insertStudent(3, "Charlie", 23);
            System.out.println("Inserted student Charlie.");

            dao.updateStudentAge(3, 24);
            System.out.println("Updated Charlie's age to 24.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}