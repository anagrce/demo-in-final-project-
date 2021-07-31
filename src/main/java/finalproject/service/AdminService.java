package finalproject.service;

import finalproject.entity.AdminEntity;
import java.util.Collection;

public interface AdminService {

    Collection<AdminEntity> findAll();
    AdminEntity findById(Integer id);
    void save(AdminEntity admin);
    void delete(AdminEntity admin);
}
