package finalproject.service;

import finalproject.entity.TeacherEntity;

import java.util.Collection;

public interface TeacherService {
    Collection<TeacherEntity> findAll();
    TeacherEntity findById(Integer id);
    void save(TeacherEntity teacher);
    void delete(TeacherEntity teacher);
}
