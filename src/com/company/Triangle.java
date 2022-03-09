package com.company;

public class Triangle {
    public static void main(String[] args) {
makeTriangle(0);
    }

    public static void makeTriangle(int number) {
        System.out.print(number);
        for (number = 0; number < 9; number++) {
            System.out.println("");
for (int value=0; value<number+2; value++){
    System.out.print(value+" ");
}


        }
    }
}
