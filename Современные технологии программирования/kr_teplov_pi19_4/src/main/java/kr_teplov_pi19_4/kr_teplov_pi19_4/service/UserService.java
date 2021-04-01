package kr_teplov_pi19_4.kr_teplov_pi19_4.service;


import kr_teplov_pi19_4.kr_teplov_pi19_4.entity.User;
import kr_teplov_pi19_4.kr_teplov_pi19_4.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public void create(User user){
        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public void updateUser(User user, Long id){
        if (findById(id).isPresent()){
            user.setId(id);
            userRepository.save(user);
        }
    }
    public boolean deleteUser(Long id) {
        if (findById(id).isPresent()) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAll(){
        userRepository.deleteAll();
    }
}
