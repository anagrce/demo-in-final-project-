package finalproject.service.serviceImpl;

import finalproject.entity.SubjectEntity;
import finalproject.repository.SubjectRepository;
import finalproject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Collection<SubjectEntity> findAll() {
        return (Collection<SubjectEntity>) subjectRepository.findAll();
    }

    @Override
    public SubjectEntity findById(Integer id) {
        return subjectRepository.findById(id).get();
    }

    @Override
    public void save(SubjectEntity subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void delete(SubjectEntity subject) {
        subjectRepository.delete(subject);
    }
}
