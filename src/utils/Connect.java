import Student.Student;
import StudentDAO.StudentDAO;
import utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {
        try {
            StudentDAO studentDao = new StudentDAO();
            Student student1 = new Student("Ange", 17,"Lycee De Rusatira");
             //Save student
            int affectedRows = studentDao.saveStudent(student1);
            System.out.println("Rows affected are: " + affectedRows);
            // delete student
            int affected = studentDao.deleteStudent("Ange");
            System.out.println("Rows affected: " + affected);

        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}