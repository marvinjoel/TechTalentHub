package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.model.Users;
import com.TechTalentHub.tech_talent_hub.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

//    @Autowired  para hacer la inyeccion sin el contructor
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

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
