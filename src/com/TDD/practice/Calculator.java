package com.TDD.practice;

public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public int add(String... args) {
        try {
            int add = 0;
            int val = 0;


            for (int i = 0; i < args.length; i++) {
                for (int j = 0; j < args[i].length(); j++) {
                    if ((!args[i].contains(",")) && (!args[i].contains(";"))) {
                        add += Integer.parseInt(String.valueOf(args[i]));
                        break;

                    } else if (Character.isDigit(args[i].charAt(j)) == true) {
                        val = Integer.parseInt(String.valueOf(args[i].charAt(j)));
                        add += val;
                    }
                }
            }
            return add;
        } catch (Exception e) {
            e.getMessage();
        }
        return 0;
    }
}









