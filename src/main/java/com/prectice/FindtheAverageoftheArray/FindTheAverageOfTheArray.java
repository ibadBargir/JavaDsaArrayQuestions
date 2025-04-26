package com.prectice.FindtheAverageoftheArray;

public class FindTheAverageOfTheArray {

    public static void main(String[] args) {

        int numbers [] = {12, 20, 22, 23, 10, 24, 26, 29, 25, 40};

        int sum =0;

        for (int num : numbers){
            sum = sum+num;

        }

        double avragenumber = (double) sum/ numbers.length;

        System.out.println("Sum of array elements: "+sum);
        System.out.println("Average of array elements: "+avragenumber );

    }
}
