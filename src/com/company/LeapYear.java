package com.company;

public class LeapYear {
    public static void main(String[] args) {
        for (int i=1; i<= 2100; i++){
             isLeapYear(i);
        }
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a LeapYear");
        }else {
            System.out.println(year + " is not LeapYear");
        }
    }
}
