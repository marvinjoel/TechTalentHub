package com.TechTalentHub.tech_talent_hub.controller;

import com.TechTalentHub.tech_talent_hub.model.Profiles;
import com.TechTalentHub.tech_talent_hub.model.Project;
import com.TechTalentHub.tech_talent_hub.service.ProfileService;
import com.TechTalentHub.tech_talent_hub.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    private final ProfileService profileService;

//    @GetMapping
//    public ResponseEntity<?> getAllProjects(){
//        return ResponseEntity.ok(projectService.findAllProject());
//    }

    @PostMapping("/{profileId}")
    public ResponseEntity<?> saveProjectForProfile(@PathVariable Long profileId, @RequestBody Project project){
        Profiles profile = profileService.findByID(profileId);

        project.setProfile(profile);
        return new ResponseEntity<>(projectService.saveProject(project), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProjectById(@PathVariable Long id){
        return ResponseEntity.ok(projectService.findByID(id));
    }

    @GetMapping("/profile/{profileId}")
    public ResponseEntity<?> getProjectsByProfileId(@PathVariable Long profileId){
        List<Project> projects = projectService.findProjectsByProfileId(profileId);
        if (projects.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay proyectos para este perfil.");
        }

        return ResponseEntity.ok(projects);
    }
}
