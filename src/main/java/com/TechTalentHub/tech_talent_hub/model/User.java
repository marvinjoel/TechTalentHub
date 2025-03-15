package com.TechTalentHub.tech_talent_hub.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false, unique = true)
    private String username;

    @Column(length = 150, nullable = false, unique = true)
    private String email;

    private String password;

    @Column(length = 1, nullable = false)
    private String typeUser;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private UserDetails userDetails;
}
