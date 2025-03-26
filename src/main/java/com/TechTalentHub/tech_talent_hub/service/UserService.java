package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.dto.UserListDTO;

import java.util.List;

public interface UserService {
    List<UserListDTO> findAllUsers();
}
