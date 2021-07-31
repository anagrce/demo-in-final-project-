package finalproject.service.serviceImpl;

import finalproject.entity.ClassroomEntity;
import finalproject.repository.ClassroomRepository;
import finalproject.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Collection<ClassroomEntity> findAll() {
        return (Collection<ClassroomEntity>) classroomRepository.findAll();
    }

    @Override
    public ClassroomEntity findById(Integer id) {
        return classroomRepository.findById(id).get();
    }

    @Override
    public void save(ClassroomEntity classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public void delete(ClassroomEntity classroom) {
        classroomRepository.delete(classroom);
    }
}
