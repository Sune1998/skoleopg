package com.company;
//løsning til opgave 1.12
public class Main {
    public static void main(String[] args) {

        double distanceMiles = 24;
        double distanceKilometers = distanceMiles * 1.6;
        double timeSeconds = 6035;

        double result = distanceKilometers / (timeSeconds / 60 / 60);

        System.out.println("Average speed in KM/H = " + result);
    }
}
