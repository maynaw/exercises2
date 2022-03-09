package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;

        //our for loop should run between the numbers 1 & 100
        for (int i = 1; i <= 100; i++) {
            // every time the loop comes by, it adds the value of i to the loop, the first time it add 0 + 1;
            // the second time it adds 1 + 2
            // the third time it adds 3 + 3 etc...
            sum += i;
        }
        System.out.println(sum);
    }
}