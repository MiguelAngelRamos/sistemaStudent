package cl.awakelab.bootcamp.controller.interfaces;

import java.util.List;
import cl.awakelab.bootcamp.model.entity.Student;


public interface IStudentController {
  
  public List<Student> findAllStundents();
  // crear
  public Student saveStudent(Student student);
  // eliminar
  public void deleteStudentById(int id);
  // actualizar
  public Student updateStudent(Student student);
  
  // para poder buscar a un student
  public Student findByIdStudent(int id);
  
}
