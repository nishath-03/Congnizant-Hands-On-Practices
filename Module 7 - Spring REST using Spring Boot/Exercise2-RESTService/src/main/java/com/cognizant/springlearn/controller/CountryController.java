package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springlearn.model.Country;

// Country REST Web Service (Hands-on 2 & 3 of spring-rest-handson 2)
@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    // Static in-memory list of countries (replaces a DB for this exercise)
    private static List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("DE", "Germany"));
        countryList.add(new Country("JP", "Japan"));
    }

    // GET /countries → returns all countries as JSON array
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("Start");
        LOGGER.debug("countries={}", countryList);
        LOGGER.info("End");
        return countryList;
    }

    // GET /countries/{code} → returns a single country by its 2-letter code
    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        LOGGER.info("Start");
        Country found = countryList.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);
        LOGGER.debug("found={}", found);
        LOGGER.info("End");
        return found;
    }
}
