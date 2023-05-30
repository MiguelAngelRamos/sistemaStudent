package cl.awakelab.bootcamp.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.google.gson.Gson;

import cl.awakelab.bootcamp.conexion.DBConnection;
import cl.awakelab.bootcamp.controller.interfaces.IUserController;
import cl.awakelab.bootcamp.model.entity.User;

public class UserController implements IUserController {

  @Override
  public String login(String username, String password) {
    
    Gson gson = new Gson();
    DBConnection conexion = DBConnection.getInstance();
    
    String sql = "SELECT * FROM users WHERE username = ? and password = ?";
    
    try {
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      statement.setString(1, username);
      statement.setString(2, password);
      
      ResultSet rs = statement.executeQuery();
      
      while(rs.next()) {
        String name = rs.getString("username");
        String pass = rs.getString("password");
        
        User user = new User(name, pass);
        return gson.toJson(user);
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    return "false";
  }

}
