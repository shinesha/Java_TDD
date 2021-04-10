package com.TDD.practice;

public class FizzBuzz {
    public String getShoutOut(int n) {
        if ((n == 3) || (n % 3 == 0)) {
            return "Fizz";
        } else if ((n==5) || (n % 5 ==0)){
            return "Buzz";
        }

        return String.valueOf(n);
    }
}