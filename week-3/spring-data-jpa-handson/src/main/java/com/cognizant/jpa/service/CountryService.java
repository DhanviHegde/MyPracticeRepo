package com.cognizant.jpa.service;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    public Optional<Country> getCountryByCode(String code) {
        return countryRepository.findById(code);
    }
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
    public List<Country> findByNameJPQL(String name) {
        return countryRepository.findByNameJPQL(name);
    }
    public List<Country> findByNameNative(String name) {
        return countryRepository.findByNameNative(name);
    }
}
