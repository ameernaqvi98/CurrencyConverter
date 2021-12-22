package com.example.CurrencyConversionProject.DTO.responses;

import lombok.Data;

@Data
public class CurrencyConversionResponse {
    private String startingCurrency;
    private String endingCurrency;
    private double startingAmt;
    private double endingAmt;

}
