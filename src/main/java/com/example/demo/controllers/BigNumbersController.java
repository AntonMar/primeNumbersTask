package com.example.demo.controllers;
import com.example.demo.services.PrimeNumbersCounter;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
import java.util.*;

@RestController
@RequestMapping("/api")
public class BigNumbersController {

    @PostMapping("/test")
    public Map createCategory(@RequestBody BigInteger[] number) {
        Map<BigInteger, Double> map = PrimeNumbersCounter.primeNumbers(number);
//        for(Map.Entry<BigInteger, Double> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Count: " + entry.getValue());
//        }
        return map;
    }
}
