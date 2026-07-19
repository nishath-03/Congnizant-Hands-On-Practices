package com.cognizant.ormlearn;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        LOGGER.info("Inside main");

        testGetAllCountries();
        testFindCountryByCode();
        testAddCountry();
    }

    // Get all countries from DB
    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }

    // Find country by code
    private static void testFindCountryByCode() {
        LOGGER.info("Start");
        Country country = countryService.findByCode("IN");
        LOGGER.debug("country={}", country);
        LOGGER.info("End");
    }

    // Add a new country
    private static void testAddCountry() {
        LOGGER.info("Start");
        countryService.addCountry(new Country("AU", "Australia"));
        LOGGER.info("End");
    }
}
