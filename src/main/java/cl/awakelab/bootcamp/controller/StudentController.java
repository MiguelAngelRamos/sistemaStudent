package cl.awakelab.bootcamp.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.bootcamp.conexion.DBConnection;
import cl.awakelab.bootcamp.controller.interfaces.IStudentController;
import cl.awakelab.bootcamp.model.entity.Student;


public class StudentController implements IStudentController {

  @Override
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

}
