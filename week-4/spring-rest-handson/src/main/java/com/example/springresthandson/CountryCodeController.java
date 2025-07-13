package com.example.springresthandson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryCodeController {
    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        if (code.equalsIgnoreCase("IN")) {
            return new Country("India", "IN");
        } else if (code.equalsIgnoreCase("US")) {
            return new Country("United States", "US");
        }
        return new Country("Unknown", code);
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
