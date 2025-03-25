package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.dto.UserListDTO;
import com.TechTalentHub.tech_talent_hub.model.User;
import com.TechTalentHub.tech_talent_hub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public List<UserListDTO> findAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> UserListDTO.builder()
                        .id(user.getId())
                        .username(user.getUsername())
                        .email(user.getEmail())
                        .role(user.getRole())
                        .photo(user.getPhoto())
                        .profiles(user.getProfiles())
                        .build())
                .collect(Collectors.toList());
    }
}
