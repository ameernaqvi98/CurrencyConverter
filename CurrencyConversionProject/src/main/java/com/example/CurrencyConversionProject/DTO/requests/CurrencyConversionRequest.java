package com.example.CurrencyConversionProject.DTO.requests;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class CurrencyConversionRequest {
    @NotBlank(message = "you must enter base currency symbol")
    private String startingCurrency;
    @NotBlank(message = "you must enter ending currency")
    private String endingCurrency;
    @Min(1)
    private double amt;
}
