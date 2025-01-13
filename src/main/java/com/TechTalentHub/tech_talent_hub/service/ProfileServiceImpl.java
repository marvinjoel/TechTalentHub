package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.model.Profiles;
import com.TechTalentHub.tech_talent_hub.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public List<Profiles> findAllProfiles(){
        return profileRepository.findAll();
    }

    @Override
    public Profiles saveProfile(Profiles profile){
        return profileRepository.save(profile);
    }

    @Override
    public Profiles findByID(Long id){
        return profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el profile con el ID: "+id));
    }
}
