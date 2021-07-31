package finalproject.service.serviceImpl;

import finalproject.entity.GradeEntity;
import finalproject.repository.GradeRepository;
import finalproject.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public Collection<GradeEntity> findAll() {
        return (Collection<GradeEntity>) gradeRepository.findAll();
    }

    @Override
    public GradeEntity findById(Integer id) {
        return gradeRepository.findById(id).get();
    }

    @Override
    public void save(GradeEntity grade) {
        gradeRepository.save(grade);
    }

    @Override
    public void delete(GradeEntity grade) {
        gradeRepository.delete(grade);
    }
}
