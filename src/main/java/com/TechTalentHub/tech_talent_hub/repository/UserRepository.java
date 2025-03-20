package com.TechTalentHub.tech_talent_hub.repository;

import com.TechTalentHub.tech_talent_hub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
