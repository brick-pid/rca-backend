package com.example.demo.controller;

import com.example.demo.logger.Logger;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/create")
    User newUser(@RequestBody User newUser) {
        Logger.log("call /user/create" + newUser.toString());
        return userRepository.save(newUser);
    }

    @GetMapping("/user/all")
    List<User> getAllUser() {
        Logger.log("call /user/all");
        return userRepository.findAll();
    }

    @PostMapping("/user/login")
    ResponseEntity<String> login(@RequestBody User user) {
        Logger.log("call /user/login");
        List<User> users = userRepository.findAll();
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                Logger.log("success: " + u.toString());
                return ResponseEntity.ok("success");
            }
        }
        Logger.log("fail");
        return ResponseEntity.ok("fail");
    }

}
