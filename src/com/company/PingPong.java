package com.company;

public class PingPong {
    public static void main(String[] args) {
       pingPong(1);
    }

    public static void pingPong(int number) {

        while (number <= 100) {
            if (number%6 == 0) {
                System.out.println(number + "ping pong");
            } else if (number%3 == 0) {
                System.out.println(number + "pong");
            } else if (number%2 == 0) {
                System.out.println(number + "ping");
            } else {
                System.out.println(number + "-");
            }
            number++;

        }
    }
}
