package com.company;

public class CurrenceExchangeWithIf {
    public static void main(String[] args) {
        double convertedValue1 = exchangeCurrencyif("HUF", 100);
        double convertedValue2 = exchangeCurrencyif("SEK", 122);
        double convertedValue3 = exchangeCurrencyif("USD", 555);
        double convertedValue4 = exchangeCurrencyif("CAD", 987);

    }

    public static double exchangeCurrencyif(String currencyID, double value) {
        double convertedValue = 0;
        if (currencyID.equals("HUF")) {
            convertedValue = value * 328.61;
            System.out.println(value + " € convert to " + convertedValue);
        } else if (currencyID.equals("SEK")) {
            convertedValue = value * 10.76;
            System.out.println(value + " € convert to " + convertedValue);

        } else if (currencyID.equals("USD")) {
            convertedValue = value * 1.12;
            System.out.println(value + " € convert to " + convertedValue);

        } else if (currencyID.equals("CAD")) {
            convertedValue = value * 1.47;
            System.out.println(value + " € convert to " + convertedValue);

        } else {
            System.out.println("unconvertable value");
        }
        return convertedValue;
    }
}
