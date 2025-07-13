package com.example.springresthandson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountryConfig {
    @Bean
    public Country country() {
        return new Country("India", "IN");
    }
}
