package finalproject.service.serviceImpl;

import finalproject.entity.UserEntity;
import finalproject.repository.UserRepository;
import finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<UserEntity> findAll() {
        return (Collection<UserEntity>) userRepository.findAll();
    }

    @Override
    public UserEntity findById(Integer id){
        return userRepository.findById(id).get();
    }

    @Override
    public void save(UserEntity user) {
        this.userRepository.save(user);
    }

    @Override
    public void delete(UserEntity userEntity) {
        this.userRepository.delete(userEntity);
    }
}
