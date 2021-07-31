package finalproject.service;

import finalproject.entity.RoleEntity;

import java.util.Collection;

public interface RoleService {
    Collection<RoleEntity> findAll();
    RoleEntity findById(Integer id);
    void save(RoleEntity role);
    void delete(RoleEntity role);
}
