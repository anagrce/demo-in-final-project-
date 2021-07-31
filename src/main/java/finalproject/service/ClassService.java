package finalproject.service;

import finalproject.entity.ClassEntity;
import java.util.Collection;

public interface ClassService {

    Collection<ClassEntity> findAll();
    ClassEntity findById(Integer id);
    void saveClass(ClassEntity classEntity);
    void deleteClass(ClassEntity classEntity);
}
