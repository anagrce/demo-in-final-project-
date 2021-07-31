package finalproject.service;

import finalproject.entity.ParentStudentEntity;

import java.util.Collection;

public interface ParentStudentService {

    Collection<ParentStudentEntity> findAll();
    ParentStudentEntity findById(Integer id);
    void save(ParentStudentEntity parentStudent);
    void delete(ParentStudentEntity parentStudent);
}
