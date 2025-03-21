package com.TechTalentHub.tech_talent_hub.dto;

import com.TechTalentHub.tech_talent_hub.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserListDTO {

    private Long id;
    private String username;
    private String email;
    private Role role;
    private Object userDetails;
}
