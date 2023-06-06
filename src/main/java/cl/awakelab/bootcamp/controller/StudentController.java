package cl.awakelab.bootcamp.controller;

import java.util.List;

import cl.awakelab.bootcamp.controller.interfaces.IStudentController;
import cl.awakelab.bootcamp.model.entity.Student;
import cl.awakelab.bootcamp.services.StudentService;


public class StudentController implements IStudentController {
  
  StudentService studentService = new StudentService();

  @Override
  public List<Student> findAllStundents() {
    return studentService.findAllStundents();
  }

  @Override
  public Student saveStudent(Student student) {
    return null;
  }

  @Override
  public void deleteStudentById(int id) {
    boolean isDeleted = studentService.deleteStudentById(id);
    
    if(isDeleted) {
      System.out.println("Student deleted");
    } else {
      System.out.println("Failed to delete Student");
    }
    
  }

  @Override
  public Student updateStudent(Student student) {
    return studentService.updateStudent(student);
  }

  @Override
  public Student findByIdStudent(int id) {
    return studentService.findByIdStudent(id);
  }

}
