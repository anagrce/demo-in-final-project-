package finalproject.service;

import finalproject.entity.TeacherSubjectClassroomEntity;
import java.util.Collection;

public interface TeacherSubjectClassroomService {

    Collection<TeacherSubjectClassroomEntity> findAll();
    TeacherSubjectClassroomEntity findById(Integer id);
    void save(TeacherSubjectClassroomEntity teacherSubjectClassroom);
    void delete(TeacherSubjectClassroomEntity teacherSubjectClassroom);
}
