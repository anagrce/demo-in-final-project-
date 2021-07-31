package finalproject.service.serviceImpl;

import finalproject.entity.ParentEntity;
import finalproject.repository.ParentRepository;
import finalproject.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public Collection<ParentEntity> findAll() {
        return (Collection<ParentEntity>) parentRepository.findAll();
    }

    @Override
    public ParentEntity findById(Integer id) {
        return parentRepository.findById(id).get();
    }

    @Override
    public void save(ParentEntity parent) {
        parentRepository.save(parent);
    }

    @Override
    public void delete(ParentEntity parent) {
        parentRepository.delete(parent);
    }
}
