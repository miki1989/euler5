package com.example.demo;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class Euler2 {

    public int check(int limit){

        while (!checkNumber(limit)){
            limit++;
        }
        return limit;
    }

    public static boolean checkNumber(int n){
        for (int i = 1; i < 20; i++) {
            if(n % i !=0){
                return false;
            }
        }
        return true;
    }

}

