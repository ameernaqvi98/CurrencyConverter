package com.example.CurrencyConversionProject.DTO.responses;

import lombok.Data;

import java.util.HashMap;

@Data
public class ExchangeRatesCurrencyResponse {
    private boolean success;
    private String timestamp;
    private String startingCurrency;
    private String date;
    private HashMap<String, Double> rates;
    private ErrorResponse error;

    @Data
    public static class ErrorResponse{
        private int code;
        private String info;
    }
}

