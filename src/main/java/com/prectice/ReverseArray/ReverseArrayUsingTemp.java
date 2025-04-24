package com.prectice.ReverseArray;

import java.util.Scanner;

public class ReverseArrayUsingTemp {

    public static void main(String[] args) {

        int[] arr = {12, 20, 40, 50, 60, 70};

       int[] reversed = new int[arr.length];

       for(int i =0; i < arr.length; i++){

          reversed[i]=arr[arr.length - 1 - i];


       }

        System.out.println("Reversed array: ");

        for (int num : reversed){
            System.out.println(num + " ");
        }


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size of Array");

        int Size = sc.nextInt();

        int orgnumber [] = new int[Size];

        System.out.println("Enter a element of Size Array: "+ Size + " numbers values");

        for(int i =0; i < Size; i++){

            orgnumber[i]=sc.nextInt();

        }

       int [] reverseduser = new int[orgnumber.length];

        for(int i = 0; i < orgnumber.length; i++){

            reverseduser[i]= orgnumber[orgnumber.length -1 -i];
        }

        System.out.println(" UserInput Reversed Number: ");
        for (int num2 : reverseduser){
            System.out.println(num2 +" ");
        }

        sc.close();
    }
}
