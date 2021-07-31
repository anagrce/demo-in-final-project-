package finalproject.controller;

import finalproject.entity.UserEntity;
import finalproject.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/")
    public Collection<UserEntity> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public UserEntity getUser(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @PostMapping(value = "/")
    public void addUser(@RequestBody UserEntity userEntity){
        this.userService.save(userEntity);
    }
    
    @PutMapping(value = "/{id}")
    public void updateUser(@PathVariable("id") Integer id, @RequestBody UserEntity user){
        UserEntity newUser = userService.findById(id);
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setVersion(user.getVersion());
        userService.save(newUser);

    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        UserEntity user = userService.findById(id);
        userService.delete(user);
    }
}
