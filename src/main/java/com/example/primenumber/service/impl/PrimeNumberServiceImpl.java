package com.example.primenumber.service.impl;


import com.example.primenumber.domain.PrimeNumberDTO;
import com.example.primenumber.domain.inbound.PrimeNumberDTOIn;
import com.example.primenumber.service.IPrimeNumberService;
import org.springframework.stereotype.Service;

@Service
public class PrimeNumberServiceImpl implements IPrimeNumberService {
    @Override
    public PrimeNumberDTO getPrimeNumber(PrimeNumberDTOIn primeNumberDTOIn) {
        PrimeNumberDTO primeNumberDTO = new PrimeNumberDTO();
        int i = 1;
        int number = primeNumberDTOIn.getNo();
        while (i <= number/2)
            if(number % i == 0){
                System.out.println(i);
                i++;
            }
            else {
                primeNumberDTO.setNo(number);
                i++;
            }

        return primeNumberDTO;
    }


}
