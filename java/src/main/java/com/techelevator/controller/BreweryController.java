package com.techelevator.controller;

import com.techelevator.dao.BreweryDao;
import com.techelevator.exception.DaoException;
import com.techelevator.model.Brewery;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class BreweryController {

    private BreweryDao breweryDao;

    public BreweryController(BreweryDao breweryDao) {
        this.breweryDao = breweryDao;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/breweries", method = RequestMethod.POST)
    public Brewery addBrewery(@Valid @RequestBody Brewery newBrewery) {
        return breweryDao.createBrewery((newBrewery));

    }

    @RequestMapping(path = "/breweries", method = RequestMethod.GET)
    public List<Brewery> list() {
        return breweryDao.getBreweries();
    }

    @RequestMapping(path = "/breweries/{id}", method = RequestMethod.GET)
    public Brewery getBreweryById(@PathVariable int id) {
        return breweryDao.getBreweryById(id);
        }

    @RequestMapping(path = "/breweries/{breweryName}", method = RequestMethod.GET)
    public List<Brewery> getBreweryByName(@RequestParam(required = false, defaultValue = "") String breweryName) {
        return breweryDao.getBreweryByName(breweryName);
    }

}