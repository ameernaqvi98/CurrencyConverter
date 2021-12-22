package com.example.CurrencyConversionProject.DTO.responses;

import lombok.Data;

@Data
public class CurrencyRateResponse {

    private String startingCurrencySymbol;
    private String endingCurrencySymbol;
    private double exchangeRate;
}
