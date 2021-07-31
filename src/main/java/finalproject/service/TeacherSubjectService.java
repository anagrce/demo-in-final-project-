package finalproject.service;

import finalproject.entity.TeacherSubjectEntity;

import java.util.Collection;

public interface TeacherSubjectService {

    Collection<TeacherSubjectEntity> findAll();
    TeacherSubjectEntity findById(Integer id);
    void save(TeacherSubjectEntity teacherSubject);
    void delete(TeacherSubjectEntity teacherSubject);
}
