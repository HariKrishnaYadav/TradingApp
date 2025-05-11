package com.hky.trading.model;

import com.hky.trading.enums.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private  boolean isEnabled=false;
    private VerificationType sendTo;
}
