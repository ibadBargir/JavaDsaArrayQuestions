package com.prectice.FindtheSmallestElementintheArray;

import java.util.Scanner;

public class SmallestElementintheArray {

    public static void main(String[] args) {

        int Arraynumber [] =  {2, 10, 30, 11, 23, 40, 20, 33, 1, 5, 1 };


        int samallArrayNumber=Arraynumber[0];


        for (int i=1; i < Arraynumber.length; i++){

            if (Arraynumber[i] < samallArrayNumber){
              samallArrayNumber= Arraynumber[i] ;
            }
        }

        System.out.println("the Smallest Element in the Array is "+ samallArrayNumber);


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Array length or Size");

        int arraySize = sc.nextInt();

        int ArraySize [] = new int [arraySize];

        System.out.println("Enter a Array Elements of : "+ arraySize);

        for (int i =0; i < arraySize; i++){

            ArraySize[i]= sc.nextInt();

        }

        int smallarraySize=ArraySize[0];

        for (int i =1; i < ArraySize.length; i++){

            if (Arraynumber[i] < smallarraySize){

                smallarraySize=ArraySize[i];
            }
        }
        System.out.println(" Find the Smallest Element in the Array for userInput is: "+ smallarraySize);

    }
}
