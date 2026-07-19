package com.cognizant.ormlearn.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    @Transactional
    public List<Stock> getByCodeAndDate(String code, LocalDate start, LocalDate end) {
        return stockRepository.findByCodeAndDateBetween(code, start, end);
    }

    @Transactional
    public List<Stock> getAbovePrice(BigDecimal price) {
        return stockRepository.findByCloseGreaterThan(price);
    }

    @Transactional
    public List<Stock> getTop5ByVolume(String code) {
        return stockRepository.findTop5ByCodeOrderByVolumeDesc(code);
    }
}
