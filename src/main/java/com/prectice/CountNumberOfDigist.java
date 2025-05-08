package com.prectice;

public class CountNumberOfDigist {
    public static void main(String[] args) {

        int num = 123456;

        int count=0;

        for(; num > 0; num = num / 10){
            count++;
        }

/*
        while (num > 0) {
            count++;
            num = num / 10;
        }
*/


        System.out.println("Number of Digist "+ count);
    }
}
