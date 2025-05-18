package com.prectice.polymorphismJAVA;

class poly {
   void makesound() {
        System.out.println("some sound");
    }
}
    class Dog extends poly{
    void makesound(){
            System.out.println("Bark");
        }
    }
    class Cat extends poly{
    void makesound(){
            System.out.println("meow");
        }
    }

public class Animal {

    public static void main(String[] args) {

        poly p1 = new Dog();

        poly p2 = new Cat();

        p1.makesound();
        p2.makesound();
    }
}
