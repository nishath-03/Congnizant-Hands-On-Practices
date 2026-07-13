package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Country;
import java.util.List;

// Repository for country query methods (Hands-on 1 of Exercise 2)
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Hands-on 1a: find countries whose name contains the given text (case-insensitive)
    List<Country> findByNameContaining(String text);

    // Hands-on 1b: same search but results sorted A-Z by name
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Hands-on 1c: find all countries whose name starts with the given letter
    List<Country> findByNameStartingWith(String prefix);
}
