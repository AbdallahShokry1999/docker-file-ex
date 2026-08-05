package com.example.dockerfileex;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
     private final com.example.dockerfileex.UserRepository userRepository;

        public UserController(com.example.dockerfileex.UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @PostConstruct
        public void init() {
            if (userRepository.count() == 0) {
                userRepository.save(new UserEntity("Abdallah"));
                userRepository.save(new UserEntity("Senior Developer"));
            }
        }

        @GetMapping
        public List<UserEntity> getUsers() {
            return userRepository.findAll();
        }
    }

