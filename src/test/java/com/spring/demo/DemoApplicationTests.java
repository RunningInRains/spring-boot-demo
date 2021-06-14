package com.spring.demo;

import com.spring.demo.hello.entity.User;
import com.spring.demo.hello.repository.UserRepository;
import com.spring.demo.hello.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = userRepository.findByUserId(1);
        user.setUserName("Change Name");
        System.out.println(user);
    }

    @Test
    void addUser() throws Exception {
        User user = new User();
        user.setUserName("Test");
        userService.save(user);
    }

}
