package com.TechTalentHub.tech_talent_hub.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profiles profile;

    @Column(nullable = false, length = 100)
    private String nameProject;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, length = 255)
    private String urlProject;
}
