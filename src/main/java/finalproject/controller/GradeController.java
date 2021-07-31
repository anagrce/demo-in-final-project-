package finalproject.controller;

import finalproject.entity.GradeEntity;
import finalproject.service.serviceImpl.GradeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/grades")
public class GradeController {

    @Autowired
    private GradeServiceImpl gradeService;

    @GetMapping(value = "/")
    public Collection<GradeEntity> getGrades(){
        return gradeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GradeEntity getGrade(@PathVariable("id") Integer id){
        return gradeService.findById(id);
    }

    @PostMapping(value = "/")
    public void addGrade(@RequestBody GradeEntity grade){
        gradeService.save(grade);
    }

    @PutMapping(value = "/{id}")
    public void updateGrade(@RequestBody GradeEntity grade, @PathVariable("id") Integer id){
        GradeEntity newGrade = gradeService.findById(id);
        newGrade.setValue(grade.getValue());
        newGrade.setDate(grade.getDate());
        newGrade.setTeacherSubjectClassrooms(grade.getTeacherSubjectClassrooms());
        gradeService.save(newGrade);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteGrade(@PathVariable("id") Integer id){
        GradeEntity grade = gradeService.findById(id);
        gradeService.delete(grade);
    }
}
