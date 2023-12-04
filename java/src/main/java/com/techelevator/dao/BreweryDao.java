package com.techelevator.dao;

import com.techelevator.model.Brewery;

import java.util.List;

public interface BreweryDao {

    List<Brewery> getBreweries();

    Brewery getBreweryById(int id);

    List<Brewery> getBreweryByName(String BreweryName);

    Brewery createBrewery(Brewery brewery);

}