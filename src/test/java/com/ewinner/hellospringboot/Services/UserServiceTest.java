package com.ewinner.hellospringboot.Services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UserService test class
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void TestCreateUser() {
        this.userService.CreateUser();
    }
}
