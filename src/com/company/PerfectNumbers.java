package com.company;

public class PerfectNumbers {
    public static void main(String[] args) {
        givePerfectNumber(1000000);
    }


    public static void givePerfectNumber(double numberRange) {
        for (double number = 1; number <= numberRange; number++) {
            double sum = 0;
            for (double divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum = sum + divisor;
                }
            }
            if (sum == number) {
                System.out.println(number + " is perfect number");

            }
        }
    }
}