package com.adil.inheritence;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barking");

    }

    @Override
    public void type() {
        System.out.println("type is Dog");

    }
}
