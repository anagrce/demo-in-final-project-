package finalproject.controller;

import finalproject.entity.StudentEntity;
import finalproject.service.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestControllerAdvice
@RequestMapping(value = "/api/v1/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping(value = "/")
    public Collection<StudentEntity> getStudents(){
        return studentService.findAll();
    }

    @PostMapping(value = "/")
    public void addStudent(@RequestBody StudentEntity student){
        studentService.save(student);
    }

    @PutMapping(value = "/{id}")
    public void updateStudent(@RequestBody StudentEntity student, @PathVariable("id") Integer id){
        StudentEntity newStudent = studentService.findById(id);
        newStudent.setName(student.getName());
        newStudent.setLastName(student.getLastName());
        newStudent.setJmbg(student.getJmbg());
        newStudent.setUser(student.getUser());
        studentService.save(newStudent);
    }

    @GetMapping(value = "/{id}")
    public StudentEntity getStudent(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        StudentEntity student = studentService.findById(id);
        studentService.delete(student);
    }
}
