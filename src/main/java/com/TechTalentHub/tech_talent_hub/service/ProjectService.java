package com.TechTalentHub.tech_talent_hub.service;

import com.TechTalentHub.tech_talent_hub.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAllProject();

    Project saveProject(Project project);

    Project findByID(Long id);

    List<Project> findProjectsByProfileId(Long profileId);
}
