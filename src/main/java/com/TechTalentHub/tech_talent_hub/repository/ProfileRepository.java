package com.TechTalentHub.tech_talent_hub.repository;

import com.TechTalentHub.tech_talent_hub.model.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profiles, Long> {
}
