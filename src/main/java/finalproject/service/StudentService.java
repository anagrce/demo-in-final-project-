package finalproject.service;

import finalproject.entity.StudentEntity;

import java.util.Collection;

public interface StudentService {

    Collection<StudentEntity> findAll();
    StudentEntity findById(Integer id);
    void save(StudentEntity student);
    void delete(StudentEntity student);
}
