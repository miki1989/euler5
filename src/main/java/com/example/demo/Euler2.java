package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Euler2 {

    public static void main(String[] args) {
        for (int i = 0; i < 50000000; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0 && i % 17 == 0 && i % 19 == 0){
                System.out.println(i);
            }

        }
    }
}

