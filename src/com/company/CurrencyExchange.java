package com.company;

public class CurrencyExchange {
    public static void main(String[] args) {

        double convertedValue1 = exchangeCurrency("HUF", 100);
        System.out.println("100 Euros convert to " + convertedValue1 + " HUF");

    }

    public static double exchangeCurrency(String curencyID, double value) {
        double convertedValue;

        switch (curencyID) {
            case "HUF" -> convertedValue = value * 328.61;

            case "SEK" -> convertedValue = value * 10.76;

            case "USD" -> convertedValue = value * 1.12;

            case "CAD" -> convertedValue = value * 1.47;

            default -> {
                System.out.println(curencyID + "unconvertable value");
                convertedValue = value;
            }

        }
        return convertedValue;

    }
}
