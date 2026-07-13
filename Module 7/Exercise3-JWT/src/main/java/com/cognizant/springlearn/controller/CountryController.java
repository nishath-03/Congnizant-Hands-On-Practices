package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springlearn.model.Country;

// Country REST controller secured by JWT
@RestController
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    private static List<Country> countryList = new ArrayList<>();

    static {
        // Initialize sample country data
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("DE", "Germany"));
        countryList.add(new Country("JP", "Japan"));
    }

    // Secured endpoint: returns JSON list of countries
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START");
        LOGGER.debug("countries={}", countryList);
        LOGGER.info("END");
        return countryList;
    }
}
