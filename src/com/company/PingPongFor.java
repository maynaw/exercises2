package com.company;

public class PingPongFor {
    public static void main(String[] args) {
        pingPongFor(1);
    }

    public static void pingPongFor(int number) {
        for (number = 1; number <= 100; number++) {
            if (number % 6 == 0) {
                System.out.println(number + "Ping Pong");
            } else if (number % 3 == 0) {
                System.out.println(number + "Pong");
            } else if (number % 2 == 0) {
                System.out.println(number + "Ping");
            } else {
                System.out.println(number + "-");
            }
        }
    }
}
