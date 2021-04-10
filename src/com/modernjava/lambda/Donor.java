package com.modernjava.lambda;

public class Donor {
    public double calulateTaxExtra(double donationAmount, double taxRate) {
        double result =  donationAmount * ( (taxRate) / (100 - (taxRate)));
        double result1 = Math.round(result * 100.0) / 100.0;

        return result1;
      //  1 * ((0.20)/ 100-(0.20))
    }
}
