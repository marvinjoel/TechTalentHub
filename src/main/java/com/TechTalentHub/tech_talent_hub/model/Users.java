package com.TechTalentHub.tech_talent_hub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String username;

    @Column(length = 150, nullable = false)
    private String email;

    private String password;

    @Column(length = 1, nullable = false)
    private String typeUser;

    @Column(length = 1200)
    private String picture;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profiles profile;
}
