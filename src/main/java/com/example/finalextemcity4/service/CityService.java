package com.example.finalextemcity4.service;

import com.example.finalextemcity4.model.City;
import com.example.finalextemcity4.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService{
    @Autowired
    private CityRepository cityRepository;

    @Override
    public Iterable<City> findAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
    cityRepository.deleteById(id);
    }
}
