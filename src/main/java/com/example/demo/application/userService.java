package com.example.demo.application;

import com.example.demo.data.userRepository;
import com.example.demo.domain.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userService {
    private final userRepository userRepo;

    public userService(userRepository userRepo) {
        this.userRepo = userRepo;
    }

    public Request createNewRequest(){
        return null;
    }
}
