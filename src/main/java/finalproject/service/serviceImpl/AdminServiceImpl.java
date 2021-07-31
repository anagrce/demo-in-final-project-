package finalproject.service.serviceImpl;

import finalproject.entity.AdminEntity;
import finalproject.repository.AdminRepository;
import finalproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public Collection<AdminEntity> findAll() {
        return (Collection<AdminEntity>) adminRepository.findAll();
    }

    @Override
    public AdminEntity findById(Integer id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public void save(AdminEntity admin) {
        adminRepository.save(admin);
    }

    @Override
    public void delete(AdminEntity admin) {
        adminRepository.delete(admin);
    }
}
