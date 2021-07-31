package finalproject.controller;

import finalproject.entity.ClassroomEntity;
import finalproject.service.serviceImpl.ClassroomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomServiceImpl classroomService;

    @GetMapping(value = "/")
    public Collection<ClassroomEntity> getClassrooms(){
        return classroomService.findAll();
    }

    @PostMapping(value = "/")
    public void addClassroom(@RequestBody ClassroomEntity classroom){
        classroomService.save(classroom);
    }

    @GetMapping(value = "/{id}")
    public ClassroomEntity getClassroom(@PathVariable("Id")Integer id){
        return classroomService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public void updateClassroom(@RequestBody ClassroomEntity classroom,@PathVariable("Id")Integer id){
        ClassroomEntity newClassroom = classroomService.findById(id);
        newClassroom.setClassid(classroom.getClassid());
        newClassroom.setStudent(classroom.getStudent());
        newClassroom.setTeacherSubjectClassroom(classroom.getTeacherSubjectClassroom());
    }
    @DeleteMapping(value = "/{id}")
    public void deleteClassroom(@PathVariable("id") Integer id){
        ClassroomEntity classroom = classroomService.findById(id);
        classroomService.delete(classroom);
    }
}
