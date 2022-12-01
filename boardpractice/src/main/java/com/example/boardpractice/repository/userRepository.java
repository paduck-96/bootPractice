package com.example.boardpractice.repository;

import java.util.HashMap;
import java.util.Map;

import com.example.boardpractice.domain.User;

public class userRepository implements userRepositoryInterface{

    private static Map<String, User> store = new HashMap<>();
    @Override
    public User join(User user) {
        // TODO Auto-generated method stub
        store.put(user.getNickname(), user);;
        return user;
    }
    
    public void clearStore(){
        store.clear();
    }
}
