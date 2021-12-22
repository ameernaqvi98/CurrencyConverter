package com.example.CurrencyConversionProject.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Currency {
    private Long id;
    private String currencyName;
    private String currencyCode;
}
