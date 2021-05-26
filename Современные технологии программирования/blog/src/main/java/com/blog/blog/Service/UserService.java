package com.blog.blog.Service;


import com.blog.blog.Repository.UserRepository;
import com.blog.blog.entity.EnterEntity;
import com.blog.blog.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
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

    public String entUser(EnterEntity enterEntity) {
        Optional<User> bufResult = UserRepository.findByEmailAndPassword(enterEntity.getEmail(), enterEntity.getPassword());
        if (bufResult.isPresent()) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                String jsonString = objectMapper.writeValueAsString(bufResult.get());
                return jsonString;
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

}
