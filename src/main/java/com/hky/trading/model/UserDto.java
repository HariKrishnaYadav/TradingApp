package com.hky.trading.model;

import com.hky.trading.enums.USER_ROLE;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class UserDto {


    private  long id;

    private String fullName;
    private String email;

    private  String password;

    @Embedded
    private TwoFactorAuth twoFactorAuth=new TwoFactorAuth();

    private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;
}
