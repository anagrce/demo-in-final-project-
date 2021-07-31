package finalproject.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import finalproject.entity.ParentEntity;
import finalproject.service.serviceImpl.ParentServiceImpl;

@RestControllerAdvice
@RequestMapping(value = "/api/v1/parents")
public class ParentController {

    @Autowired
    private ParentServiceImpl parentService;

    @GetMapping(value = "/")
    public Collection<ParentEntity> getParents(){
        return parentService.findAll();
    }

    @PostMapping(value = "/")
    public void addParent(@RequestBody ParentEntity parent){
        parentService.save(parent);
    }

    @PutMapping(value = "/{id}")
    public void updateParent(@RequestBody ParentEntity parent, @PathVariable("id") Integer id){
    	ParentEntity newParent = parentService.findById(id);
        newParent.setName(parent.getName());
        newParent.setLastName(parent.getLastName());
        newParent.setEmail(parent.getEmail());
        
        parentService.save(newParent);
    }

    @GetMapping(value = "/{id}")
    public ParentEntity getParent(@PathVariable("id") Integer id){
        return parentService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteParent(@PathVariable("id") Integer id){
    	ParentEntity parent = parentService.findById(id);
    	parentService.delete(parent);
    }
}
