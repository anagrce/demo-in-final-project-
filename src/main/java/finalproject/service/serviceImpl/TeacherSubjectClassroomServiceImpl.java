package finalproject.service.serviceImpl;

import finalproject.entity.TeacherSubjectClassroomEntity;
import finalproject.repository.TeacherSubjectClassroomRepository;
import finalproject.service.TeacherSubjectClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeacherSubjectClassroomServiceImpl implements TeacherSubjectClassroomService {

    @Autowired
    private TeacherSubjectClassroomRepository teacherSubjectClassroomRepository;

    @Override
    public Collection<TeacherSubjectClassroomEntity> findAll() {
        return (Collection<TeacherSubjectClassroomEntity>) teacherSubjectClassroomRepository.findAll();
    }

    @Override
    public TeacherSubjectClassroomEntity findById(Integer id) {
        return teacherSubjectClassroomRepository.findById(id).get();
    }

    @Override
    public void save(TeacherSubjectClassroomEntity teacherSubjectClassroom) {
        teacherSubjectClassroomRepository.save(teacherSubjectClassroom);
    }

    @Override
    public void delete(TeacherSubjectClassroomEntity teacherSubjectClassroom) {
        teacherSubjectClassroomRepository.delete(teacherSubjectClassroom);
    }
}
