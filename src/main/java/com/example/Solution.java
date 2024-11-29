package com.example;

import java.util.Scanner;

public class Solution {
    public void startCalc() {
        Double side = inputDouble("Oldal: ");
        Double height = inputDouble("Magasság: ");
        Double volume = calcVolume(side, height);
        System.out.printf("%f\n", volume);
    }
    private double inputDouble(String message){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String valueStr = scanner.nextLine();
        Double value = Double.parseDouble(valueStr);
        return value;
    }
    public double calcVolume(double side, double height) {
        return 1.0/3.0 * Math.pow(side, 2) * height;
    }
}
