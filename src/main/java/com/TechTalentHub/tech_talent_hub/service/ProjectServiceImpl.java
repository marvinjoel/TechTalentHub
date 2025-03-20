package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.model.Project;
import com.TechTalentHub.tech_talent_hub.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepository projectRepository;

    @Override
    public List<Project> findAllProject(){
        return projectRepository.findAll();
    }

    @Override
    public Project saveProject(Project project){
        return projectRepository.save(project);
    }

    @Override
    public Project findByID(Long id){
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el profile con el ID: "+id));
    }

    @Override
    public List<Project> findProjectsByProfileId(Long profileId){
        return projectRepository.findAll().stream()
                .filter(project -> project.getProfile().getId().equals(profileId))
                .toList();
    }
}
