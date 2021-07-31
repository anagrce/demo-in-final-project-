package finalproject.service;

import finalproject.entity.ClassroomEntity;

import java.util.Collection;

public interface ClassroomService {

    Collection<ClassroomEntity> findAll();
    ClassroomEntity findById(Integer id);
    void save(ClassroomEntity classroom);
    void delete(ClassroomEntity classroom);
}
