package com.userservice.controller;

import com.userservice.entity.User;
import com.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));

    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return  ResponseEntity.ok(userService.getAllUser());
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User>getSingleUser(@PathVariable String userId){

        return ResponseEntity.ok(userService.getUser(userId));
    }
     @PutMapping
     public ResponseEntity<User> updateOneUser(@RequestBody User user){
         User user1 = userService.updateUser(user);
         return ResponseEntity.status(HttpStatus.CREATED).body(user1);
     }@DeleteMapping("/users/{userId}")
     public void deleteUserById(@PathVariable String userId){
          userService.deleteUserById(userId);

     }


}
