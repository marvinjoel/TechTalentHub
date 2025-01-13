package com.TechTalentHub.tech_talent_hub.controller;


import com.TechTalentHub.tech_talent_hub.model.Profiles;
import com.TechTalentHub.tech_talent_hub.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping
    public ResponseEntity<?> getAllProfiles(){
        return ResponseEntity.ok(profileService.findAllProfiles());
    }

    @PostMapping
    public ResponseEntity<?> saveProfile(@RequestBody Profiles profile){
        return new ResponseEntity<>(profileService.saveProfile(profile), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProfileId(@PathVariable Long id){
        return ResponseEntity.ok(profileService.findByID(id));
    }
}
