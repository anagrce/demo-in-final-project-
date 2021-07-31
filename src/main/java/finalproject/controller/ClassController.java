package finalproject.controller;

import finalproject.entity.ClassEntity;
import finalproject.service.serviceImpl.ClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/classes")
public class ClassController {

    @Autowired
    private ClassServiceImpl classService;

    @GetMapping(value = "/")
    public Collection<ClassEntity> getClasses(){
        return classService.findAll();
    }

    @PostMapping(value = "/")
    public void addClass(@RequestBody ClassEntity classEntity){
        classService.saveClass(classEntity);
    }

    @GetMapping(value = "/{id}")
    public ClassEntity getClass(@PathVariable("id") Integer id){
        return classService.findById(id);
    }
    
    @PutMapping(value = "/{id}")
    public void updateClass(@PathVariable("id") Integer id, @RequestBody ClassEntity classEntity){
        ClassEntity newClass = classService.findById(id);
        newClass.setMark(classEntity.getMark());
        newClass.setNumber(classEntity.getNumber());
        newClass.setClass_id(classEntity.getClass_id());
        classService.saveClass(newClass);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteClass(@PathVariable("id") Integer id){
        ClassEntity classEntity = classService.findById(id);
        classService.deleteClass(classEntity);
    }
}
