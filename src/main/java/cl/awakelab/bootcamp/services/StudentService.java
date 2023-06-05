package cl.awakelab.bootcamp.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.bootcamp.conexion.DBConnection;
import cl.awakelab.bootcamp.model.entity.Student;

public class StudentService {

  public List<Student> findAllStundents() {
    
    List<Student> students = new ArrayList<>();
    DBConnection conexion = DBConnection.getInstance();
    String sql = "SELECT * FROM students";
    
    try {
      
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      ResultSet rs = statement.executeQuery();
      
      while(rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String lastname = rs.getString("lastname"); 
        String email = rs.getString("email");
        Student student = new Student(id, name, lastname, email);
        students.add(student);
        // System.out.println(students);
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return students;
  }
  
  public boolean deleteStudentById(int idStudent) {
    
    DBConnection conexion = DBConnection.getInstance();
    String sql = "DELETE FROM students WHERE id = ?" ;
    
    try {
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      statement.setInt(1, idStudent);
      int rowsAffected = statement.executeUpdate();
      
      return rowsAffected > 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }
     
  }
}
