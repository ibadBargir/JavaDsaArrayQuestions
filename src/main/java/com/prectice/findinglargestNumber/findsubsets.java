package com.prectice.findinglargestNumber;

import java.util.*;


public class findsubsets {
    public static void printsubset(ArrayList<Integer> subset){
        for (int i=0; i < subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void bsets(int n , ArrayList<Integer> subset){

        if(n==0){
            printsubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        bsets(n-1, subset);

        //add nhi hoga

        subset.remove(subset.size()-1);
        bsets(n-1, subset);
    }

    public static void main(String[] args) {

        int n =3;
        ArrayList<Integer> subset = new  ArrayList<>();
        bsets(n, subset);
    }
}
