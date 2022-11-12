package com.example.primenumber.controller;


import com.example.primenumber.domain.PrimeNumberDTO;
import com.example.primenumber.domain.inbound.PrimeNumberDTOIn;
import com.example.primenumber.service.IPrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {
    @Autowired
    IPrimeNumberService iPrimeNumberService;

    @GetMapping("/primeNumber")
    public PrimeNumberDTO getPrimeNumber(@RequestBody PrimeNumberDTOIn primeNumberDTOIn){
        return iPrimeNumberService.getPrimeNumber(primeNumberDTOIn);
    }
}
