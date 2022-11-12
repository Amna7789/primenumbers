package com.example.primenumber.service;


import com.example.primenumber.domain.PrimeNumberDTO;
import com.example.primenumber.domain.inbound.PrimeNumberDTOIn;

public interface IPrimeNumberService {
    public PrimeNumberDTO getPrimeNumber(PrimeNumberDTOIn primeNumberDTOIn);
}
