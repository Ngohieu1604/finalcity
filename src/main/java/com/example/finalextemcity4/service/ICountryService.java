package com.example.finalextemcity4.service;

import com.example.finalextemcity4.model.Country;

import java.util.Optional;

public interface ICountryService {
    Iterable<Country> findAllCountries();

    Optional<Country> findById(Long id);
}
