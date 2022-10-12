package com.example.finalextemcity4.service;

import com.example.finalextemcity4.model.Country;
import com.example.finalextemcity4.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService{
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }
}
