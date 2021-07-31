package finalproject.controller;

import finalproject.entity.TeacherSubjectClassroomEntity;
import finalproject.service.serviceImpl.TeacherSubjectClassroomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/teachersSubjectsClassrooms")
public class TeacherSubjectClassroomController {

    @Autowired
    private TeacherSubjectClassroomServiceImpl teacherSubjectClassroomService;

    @GetMapping(value = "/")
    public Collection<TeacherSubjectClassroomEntity> getTeachersSubjectsClassrooms(){
        return teacherSubjectClassroomService.findAll();
    }

    @GetMapping(value = "/{id}")
    public TeacherSubjectClassroomEntity getTeacherSubjectClassroom(@PathVariable("id") Integer id){
        return teacherSubjectClassroomService.findById(id);
    }

    @PostMapping(value = "/")
    public void addTeacherSubjectClassroom(@RequestBody TeacherSubjectClassroomEntity teacherSubjectClassroomEntity){
        teacherSubjectClassroomService.save(teacherSubjectClassroomEntity);
    }

    @PutMapping(value = "/{id}")
    public void updateTeacherSubjectClassroom(@RequestBody TeacherSubjectClassroomEntity teacherSubjectClassroomEntity, @PathVariable("id") Integer id){
        TeacherSubjectClassroomEntity newTeacherSubjectClassroom = teacherSubjectClassroomService.findById(id);
        newTeacherSubjectClassroom.setClassroom(teacherSubjectClassroomEntity.getClassroom());
        newTeacherSubjectClassroom.setGrade(teacherSubjectClassroomEntity.getGrade());
        newTeacherSubjectClassroom.setTeacherSubject(teacherSubjectClassroomEntity.getTeacherSubject());
        teacherSubjectClassroomService.save(newTeacherSubjectClassroom);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTeacherSubjectClassroom(@PathVariable("id") Integer id){
        TeacherSubjectClassroomEntity teacherSubjectClassroom = teacherSubjectClassroomService.findById(id);
        teacherSubjectClassroomService.delete(teacherSubjectClassroom);
    }
}
