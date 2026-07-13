package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Stock;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

// Repository for stock query methods (Hands-on 2 of Exercise 2)
@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    // Get all stock records for a given ticker code between two dates
    List<Stock> findByCodeAndDateBetween(String code, LocalDate start, LocalDate end);

    // Get stocks where close price is greater than the given value
    List<Stock> findByCloseGreaterThan(BigDecimal price);

    // Get top 5 stocks by volume in descending order for a given code
    List<Stock> findTop5ByCodeOrderByVolumeDesc(String code);
}
