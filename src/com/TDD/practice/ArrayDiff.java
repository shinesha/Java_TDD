package com.TDD.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDiff {
//    public static int[] arrayDiff(int[] a, int[] b) {
//        // Your code here
//        Integer[] list = ArrayUtils.toObject();
//
//    }
    public static int findIt(int[] a) {
        List<Integer> listA=new ArrayList<Integer>();
        int count = 0;
        int countMax = 0;
        int placer = 0;
        for (int i: a){
            if (i % 2 !=0){
                //System.out.println(i);
                listA.add(i);
            }

        }
        Collections.sort(listA);
        System.out.println(listA);
        for (int j = 0; j<=listA.size()-2; j++){
            if (listA.get(j) == listA.get(j+1)){
               // System.out.println(j);
                count +=1;
                //System.out.println((count));
                if (count>countMax){
                    countMax = count;
                }
            }
        }
        System.out.println((count));
  	return count;
}
}
