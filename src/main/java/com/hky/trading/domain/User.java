package com.hky.trading.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hky.trading.enums.USER_ROLE;
import com.hky.trading.model.TwoFactorAuth;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String fullName;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  String password;

    @Embedded
    private TwoFactorAuth twoFactorAuth=new TwoFactorAuth();

    private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;
}
