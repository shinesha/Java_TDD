package com.TDD.practice;

public class StringUtils {
    public String lastTwo(String a) {
        if (a.length() == 1) {
            return a;
        }else{
            int length = a.length();
            char last = a.charAt(length-1);

            char second = a.charAt(length-2);

            return a.substring(0, length-2) + String.valueOf(last) + String.valueOf(second);

        }
    }

}

