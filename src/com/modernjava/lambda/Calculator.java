package com.modernjava.lambda;

public class Calculator {

    public double add(double number1, double number2) {

        return number1 + number2;
    }

    public int add(String num1, String num2) {

        int val = Integer.parseInt(num1) + Integer.parseInt(num2);


        return val;
    }

}
