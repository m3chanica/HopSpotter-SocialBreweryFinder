package com.techelevator.dao;

import com.techelevator.model.Beer;

import java.util.List;

public interface BeerDao {

    List<Beer> getBeers();

    Beer getBeerById(int id);

    List<Beer> getBeerByName(String name);

    Beer createBeer(Beer beer);
}
