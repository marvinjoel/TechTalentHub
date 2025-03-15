package com.TechTalentHub.tech_talent_hub.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "user_id", unique = true, nullable = false)
    private User user;

    @Column(length = 1200)
    private String picture;
}
