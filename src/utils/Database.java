package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbcDemo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}


//import Student.Student;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class utils.Connect {
//    public static void main(String[] args) {
//        Student student1 = new Student(10, "Mugabe Jean Aime", 17);
//        String url = "jdbc:mysql://localhost:3306/jdbcDemo";
//        String username = "root";
//        String password = "";
//
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            String insertQuery = "INSERT INTO student values (?,?,?)";
//            try(PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){
//                preparedStatement.setInt(1, student1.id);
//                preparedStatement.setString(2,student1.name);
//                preparedStatement.setInt(3,student1.age);
//
//                int affectedRow = preparedStatement.executeUpdate();
//                System.out.println("Rows affected are: "+ affectedRow);
//            }
//            connection.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
