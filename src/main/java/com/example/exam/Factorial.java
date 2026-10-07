package com.example.exam;

public class Factorial {
    public static int factorial(int nInput) {
        if (nInput == 0) {
            return 1;
        }
        return nInput * factorial(nInput - 1);
    }
}
