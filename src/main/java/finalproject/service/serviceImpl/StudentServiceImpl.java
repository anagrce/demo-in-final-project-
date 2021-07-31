package finalproject.service.serviceImpl;

import finalproject.entity.StudentEntity;
import finalproject.repository.StudentRepository;
import finalproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Collection<StudentEntity> findAll() {
        return (Collection<StudentEntity>) studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void save(StudentEntity student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(StudentEntity student) {
        studentRepository.delete(student);
    }
}
