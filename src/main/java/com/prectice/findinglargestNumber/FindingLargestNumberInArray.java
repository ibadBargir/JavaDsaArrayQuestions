package com.prectice.findinglargestNumber;
import java.util.*;

// Steps to Find the Largest Number in an Array



public class FindingLargestNumberInArray {

    public static void main(String[] args) {


//step 1 to create  array

        int number [] = {10, 9, 17, 26, 12, 15, 71, 29, 26, 52, 48, 82, 93, 123, 127, 112, 77};

        // Step 2: Assume the first element is the largest
        int largest = number[0];

        // Step 3: Loop through the array

        for (int i =1; i<number.length; i++){

            // Step 4: Compare each element

            if (number[i]> largest){
                largest=number[i];
            }
        }
        // Step 6: Print the result

        System.out.println("The largest number in the array is: "+ largest);


        // this will get the  values and size from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");

        int Size = sc.nextInt();

        int[] number2 = new int [Size];

        // step  to get values from the user

        System.out.println("Enter the value of Size: "+ Size +" Array");

        for(int i=0; i < Size; i++){
            number2[i]= sc.nextInt();
        }

       int largest2 = number2[0];

        for (int i=1; i< number2.length; i++){

            if(number2[i]> number2[0]){
                largest2= number2[i];
            }
        }

        System.out.println("Largest Array number from user input is: "+ largest2);
    }
}