package com.userservice.services;

import com.userservice.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //create new resource
    User saveUser(User user);

    //get user service
    List<User> getAllUser();

    //get single user
    User getUser(String userId);



    User updateUser(User user);



    void deleteUserById(String userId);


    //update the userId

}
