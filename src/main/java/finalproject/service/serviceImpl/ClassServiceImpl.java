package finalproject.service.serviceImpl;

import finalproject.entity.ClassEntity;
import finalproject.repository.ClassRepository;
import finalproject.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepository classRepository;

    @Override
    public Collection<ClassEntity> findAll() {
        return (Collection<ClassEntity>) classRepository.findAll();
    }

    @Override
    public ClassEntity findById(Integer id) {
        return classRepository.findById(id).get();
    }

    @Override
    public void saveClass(ClassEntity classEntity) {
        classRepository.save(classEntity);
    }

    @Override
    public void deleteClass(ClassEntity classEntity) {
        classRepository.delete(classEntity);
    }
}
