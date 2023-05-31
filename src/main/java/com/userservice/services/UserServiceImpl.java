package com.userservice.services;

import com.userservice.entity.User;
import com.userservice.exception.ResourceNotFoundException;
import com.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    private User user;

    @Override
    public User saveUser(User user) {
     String randomUserId = UUID.randomUUID().toString();
      user.setUserId(randomUserId);

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }



    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("user with given id not found in server :"+userId));
    }


    @Override
    public User updateUser(User user) {
        User save = userRepository.save(user);
        return save;
    }

    public void deleteUserById(String userId) {
        userRepository.deleteById(userId);
    }
}
