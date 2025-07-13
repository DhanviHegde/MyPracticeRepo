package com.example.springresthandson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/country")
    public Country getCountry() {
        return new Country("India", "IN");
    }
}

class Country {
    private String name;
    private String code;

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() { return name; }
    public String getCode() { return code; }
}
