package com.TechTalentHub.tech_talent_hub.repository;

import com.TechTalentHub.tech_talent_hub.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
