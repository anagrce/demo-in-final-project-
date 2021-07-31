package finalproject.service;

import finalproject.entity.UserEntity;

import java.util.Collection;

public interface UserService {
    Collection<UserEntity> findAll();
    UserEntity findById(Integer id);
    void save(UserEntity user);
    void delete(UserEntity user);
}
