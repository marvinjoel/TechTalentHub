package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.model.Users;
import com.TechTalentHub.tech_talent_hub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private  UserRepository userRepository;

//    public UserServiceImpl(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    @Override
    public List<Users> findAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public Users saveUser(Users user){
        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}
