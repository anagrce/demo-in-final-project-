package finalproject.controller;

import finalproject.entity.AdminEntity;
import finalproject.service.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1/admins")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping(value = "/")
    public Collection<AdminEntity> getAllAdmins(){
        return this.adminService.findAll();
    }

    @PostMapping(value = "/")
    public void addAdmin(@RequestBody AdminEntity admin){
        AdminEntity newAdmin = new AdminEntity();
        newAdmin.setLastName(admin.getLastName());
        newAdmin.setName(admin.getName());
        newAdmin.setUser(admin.getUser());
        this.adminService.save(admin);
    }

    @GetMapping(value = "/{id}")
    public AdminEntity getAdmin(@PathVariable("id") Integer id){
        return adminService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public void updateAdmin(@PathVariable("id") Integer id, @RequestBody AdminEntity admin){
        AdminEntity newAdmin = adminService.findById(id);
        newAdmin.setLastName(admin.getLastName());
        newAdmin.setName(admin.getName());
        newAdmin.setUser(admin.getUser());
        this.adminService.save(admin);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAdmin(@PathVariable("id") Integer id){
        AdminEntity admin = adminService.findById(id);
        adminService.delete(admin);
    }
}
