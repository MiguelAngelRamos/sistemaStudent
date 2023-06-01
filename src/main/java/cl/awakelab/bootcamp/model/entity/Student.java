package cl.awakelab.bootcamp.model.entity;

import java.io.Serializable;

public class Student implements Serializable{
  
  private int id;
  private String name;
  private String lastname; 
  private String email;
  
  public Student() {

  } 
  
  public Student(int id, String name, String lastname, String email) {

    this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + "]";
  }

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

}
