package com.prectice;

public class prectice {
    public static void main(String[] args) {
       //5 Ways of swapping Numbers in JAVA
        int a =10; int b=20;
        System.out.println("before swaping values a= "+a +" and b = "+b);
        //logic 1 third veriebel
        /*int t =a; //10
        a=b;  // a =20
        b=t; // b =10*/

        //second logic
       /* a = a+b; //=30
        b = a-b; // =10
        a = a-b;*/

        //third logic
      /*  a= a*b; //10*20=200
        b= a/b; //200/20= 10;
        a=a/b; //200/10=20*/

        //forth logic
        // bitwise XOR  (^)
       /* a= a^b;  // 10^20=30
        b= a^b; //30^20=10
        a=a^b;  // 30^10=20*/

        //firth logic
        //single statement
        b=a+b - (a=b);  // this statement right run first                 b =  ( a+b = 30)-(a=b = 20)  = 30 -20 = 10
       
        System.out.println("a = "+a +" and b = "+b);

    }
}
