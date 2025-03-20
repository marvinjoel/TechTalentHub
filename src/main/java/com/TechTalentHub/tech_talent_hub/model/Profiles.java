package com.TechTalentHub.tech_talent_hub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Profiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "details_id", nullable = false, unique = true)
    private Details details;

    @Column(nullable = false)
    private String skills;

    @Column(nullable = false)
    private String experience;

    @Column(nullable = false, length = 255)
    private String socialNetworking;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Project> projects = new ArrayList<>();

}
