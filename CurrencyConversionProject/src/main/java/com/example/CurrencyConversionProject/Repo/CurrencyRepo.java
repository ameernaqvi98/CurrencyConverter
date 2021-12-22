package com.example.CurrencyConversionProject.Repo;

import com.example.CurrencyConversionProject.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency,Long> {

}
