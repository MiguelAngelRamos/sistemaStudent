package test;

import java.sql.ResultSet;
import java.sql.Statement;

import cl.awakelab.bootcamp.conexion.DBConnection;
import cl.awakelab.bootcamp.model.entity.Usuarios;

public class DBTestConnection {
  
  private static DBConnection instanceDbConnection;
  
  DBTestConnection() {
    instanceDbConnection = DBConnection.getInstance();
  }
  
  public static void main(String[] args) {
    new DBTestConnection();
    findAllStudents();
 
  }
  
  public static void findAllStudents() {
    
    String sql = "SELECT * FROM students";
    
    try {
      Statement statement = instanceDbConnection.getConnection().createStatement();
      ResultSet resultSet = statement.executeQuery(sql);
      
      while(resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String lastname = resultSet.getString("lastname");
        String email = resultSet.getString("email");
        
   
        Usuarios user = new Usuarios(id, name, lastname, email);
        System.out.println(user.toString());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
}
