package com.hky.trading.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TradingConfig {
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
