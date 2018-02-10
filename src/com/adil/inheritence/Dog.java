package com.adil.inheritence;

public class Dog extends Animal implements OnWalk {
    @Override
    public void walk() {
        System.out.println("Dog is walking");

    }

    @Override
    public void speak() {
        System.out.println("speak");
        super.speak();
    }

    {
        System.out.println("Dog barking");

    }

    @Override
    public void type() {
        System.out.println("Type is Dog");

    }
}
