package com.example.finalextemcity4.service;

import com.example.finalextemcity4.model.City;
import java.util.Optional;

public interface ICityService {
    Iterable<City> findAllCities();

    Optional<City> findById(Long id);

    City save(City city);

    void remove(Long id);
}
