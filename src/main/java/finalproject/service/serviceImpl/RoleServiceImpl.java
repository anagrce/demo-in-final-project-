package finalproject.service.serviceImpl;

import finalproject.entity.RoleEntity;
import finalproject.repository.RoleRepository;
import finalproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Collection<RoleEntity> findAll() {
        return (Collection<RoleEntity>) roleRepository.findAll();
    }

    @Override
    public RoleEntity findById(Integer id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public void save(RoleEntity role) {
        roleRepository.save(role);
    }

    @Override
    public void delete(RoleEntity role) {
        roleRepository.delete(role);
    }
}
