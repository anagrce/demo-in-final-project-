package finalproject.service.serviceImpl;

import finalproject.entity.ParentStudentEntity;
import finalproject.repository.ParentStudentRepository;
import finalproject.service.ParentStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ParentStudentServiceImpl implements ParentStudentService {

    @Autowired
    private ParentStudentRepository parentStudentRepository;

    @Override
    public Collection<ParentStudentEntity> findAll() {
        return (Collection<ParentStudentEntity>) parentStudentRepository.findAll();
    }

    @Override
    public ParentStudentEntity findById(Integer id) {
        return parentStudentRepository.findById(id).get();
    }

    @Override
    public void save(ParentStudentEntity parentStudent) {
        parentStudentRepository.save(parentStudent);
    }

    @Override
    public void delete(ParentStudentEntity parentStudent) {
        parentStudentRepository.delete(parentStudent);
    }
}
