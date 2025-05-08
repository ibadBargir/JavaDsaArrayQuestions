//CONDITIONS
//Natural Number > 1
// which has only  2 factors  1 and itself

// 19  => 1 and 19 => prime Number
// 28 => 1,2,4,7,14,28 => Not a Prime Number

package com.prectice;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 3;
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("This is a Prime Number");
            } else {
                System.out.println("This is not a Prime Number");
            }

        } else {
            System.out.println("Number is not greater than 1");
        }
    }
}
