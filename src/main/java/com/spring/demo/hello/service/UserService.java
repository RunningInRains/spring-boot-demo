package com.spring.demo.hello.service;

import com.spring.demo.hello.entity.User;
import com.spring.demo.hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Integer userId){
        userRepository.save(new User());
        return userRepository.findByUserId(userId);
    }

    public void save(User user){
        userRepository.save(user);
    }
}
