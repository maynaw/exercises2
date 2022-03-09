package com.company;

public class SumLoop{
    public static void main(String[] args) {
        int number;
        int sum = 0;
        for (number = 0; number<= 100; number++) {
            sum = number + sum;
        }
        System.out.println(sum);
    }
}
