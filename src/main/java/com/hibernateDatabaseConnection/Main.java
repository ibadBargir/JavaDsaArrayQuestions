package com.hibernateDatabaseConnection;

import java.util.Scanner;

public class Main {

    public static int calculatesum(int arry[]){

        int sum=0;
        System.out.println("Calculating a sum of total:");
        for (int i=0; i < arry.length; i++){
            System.out.println("Elements "+ i + " = " + "arry[i]");
            sum+=arry[i];
        }

        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Get a Size a Array from user
        System.out.println("Enter a Size of Array");
        int size = sc.nextInt();

        //step 2 declar a array

        int number [] = new int[size];

        // step 3 to get values from the user

        System.out.println("Enter "+size+" elements");
        for (int i =0; i< size; i++){
           number[i]=sc.nextInt();

        }

        int total = calculatesum(number);
        System.out.println("Sum of total numbers = "+ total);

        sc.close();
    }
}