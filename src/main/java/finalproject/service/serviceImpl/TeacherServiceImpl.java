package finalproject.service.serviceImpl;

import finalproject.entity.TeacherEntity;
import finalproject.repository.TeacherRepository;
import finalproject.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Collection<TeacherEntity> findAll() {
        return (Collection<TeacherEntity>) teacherRepository.findAll();
    }

    @Override
    public TeacherEntity findById(Integer id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public void save(TeacherEntity teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void delete(TeacherEntity teacher) {
        teacherRepository.delete(teacher);
    }
}
