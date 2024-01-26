package StudentDAO;

import Student.Student;
import utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO{

    public int saveStudent(Student student) throws SQLException {
        Connection connection = Database.getConnection();
        String insertQuery = "INSERT INTO student values (?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getSchool());
            return preparedStatement.executeUpdate();
        } finally {
            connection.close();
        }
    }
    public int deleteStudent(String name) throws SQLException {
        Connection connection = Database.getConnection();
        String insertQuery = "DELETE from student WHERE name = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            return preparedStatement.executeUpdate();
        } finally {
            connection.close();
        }
    }
}
