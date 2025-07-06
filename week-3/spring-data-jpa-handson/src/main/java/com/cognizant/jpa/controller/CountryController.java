package com.cognizant.jpa.controller;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Optional<Country> getCountryByCode(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @GetMapping("/jpql/{name}")
    public List<Country> findByNameJPQL(@PathVariable String name) {
        return countryService.findByNameJPQL(name);
    }

    @GetMapping("/native/{name}")
    public List<Country> findByNameNative(@PathVariable String name) {
        return countryService.findByNameNative(name);
    }
}
