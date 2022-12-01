package com.example.boardpractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.boardpractice.domain.User;
import com.example.boardpractice.repository.userRepository;

@SpringBootTest
public class repositoryTest {

    userRepository repository = new userRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void join(){
        User user = new User();
        user.setEmail("kangjideok@gmail.com");
        user.setNickname("paduck");
        user.setPassword("123456");

        repository.join(user);

        assert
    }
    
}
