package com.steinkeit.persistentH2.domain.model.services;

import com.steinkeit.persistentH2.domain.model.User;
import com.steinkeit.persistentH2.infrastructure.persistence.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    public void save(User user) {
        this.userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return (List<User>) this.userRepository.findAll();
    }
}
