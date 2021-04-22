package com.TDD.practice;

import java.io.Serializable;

public class NumeralConverter {

    public Serializable convert(int i) {
        int count = 0;
        if (i == 1) {
            return "I";
        }else if (i==5){
            return "V";
        }else if (i==10){
            return "X";
        } else if (i==50){
            return "L";
        }else if (i==100){
            return "C";
        }else if (i==500){
            return "D";
        }else if (i==1000) {
            return "M";
        } else
        {
            while (i != 1) {
                i = i / 10;
                ++count;
            }
            System.out.println(count);
            return count;
        }

       // return "I";
    }
}
