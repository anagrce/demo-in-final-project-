package finalproject.controller;

import finalproject.entity.TeacherEntity;
import finalproject.service.serviceImpl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/teachers")
public class TeacherController {

    @Autowired
    private TeacherServiceImpl teacherService;

    @GetMapping(value = "/")
    public Collection<TeacherEntity> getTeachers(){
        return teacherService.findAll();
    }

    @PostMapping(value = "/")
    public void addTeacher(@RequestBody TeacherEntity teacher){
        teacherService.save(teacher);
    }

    @PutMapping(value = "/{id}")
    public void updateTeacher(@RequestBody TeacherEntity teacher, @PathVariable("id") Integer id){
        TeacherEntity newTeacher = teacherService.findById(id);
        newTeacher.setName(teacher.getName());
        newTeacher.setLastName(teacher.getLastName());
        newTeacher.setVersion(teacher.getVersion());
        newTeacher.setUser(teacher.getUser());
        teacherService.save(newTeacher);
    }

    @GetMapping(value = "/{id}")
    public TeacherEntity getTeacher( @PathVariable("id") Integer id){
        return teacherService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTeacher( @PathVariable("id") Integer id){
        TeacherEntity teacher = teacherService.findById(id);
        teacherService.delete(teacher);
    }
}
