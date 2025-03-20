package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.model.Profiles;

import java.util.List;


public interface ProfileService {
    List<Profiles> findAllProfiles();

    Profiles saveProfile(Profiles profile);

    Profiles findByID(Long id);
}
