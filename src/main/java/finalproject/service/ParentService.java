package finalproject.service;

import finalproject.entity.ParentEntity;

import java.util.Collection;

public interface ParentService {

    Collection<ParentEntity> findAll();
    ParentEntity findById(Integer id);
    void save(ParentEntity parent);
    void delete(ParentEntity parent);
}
