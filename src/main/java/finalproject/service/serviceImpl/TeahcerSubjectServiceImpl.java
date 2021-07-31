package finalproject.service.serviceImpl;

import finalproject.entity.TeacherSubjectEntity;
import finalproject.repository.TeacherSubjectRepository;
import finalproject.service.TeacherSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeahcerSubjectServiceImpl implements TeacherSubjectService {

    @Autowired
    private TeacherSubjectRepository teacherSubjectRepository;

    @Override
    public Collection<TeacherSubjectEntity> findAll() {
        return (Collection<TeacherSubjectEntity>) teacherSubjectRepository.findAll();
    }

    @Override
    public TeacherSubjectEntity findById(Integer id) {
        return teacherSubjectRepository.findById(id).get();
    }

    @Override
    public void save(TeacherSubjectEntity teacherSubject) {
        teacherSubjectRepository.save(teacherSubject);
    }

    @Override
    public void delete(TeacherSubjectEntity teacherSubject) {
        teacherSubjectRepository.delete(teacherSubject);
    }
}
