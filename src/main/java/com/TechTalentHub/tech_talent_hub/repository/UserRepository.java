package com.TechTalentHub.tech_talent_hub.repository;

import com.TechTalentHub.tech_talent_hub.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long>{
}
