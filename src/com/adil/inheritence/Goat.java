package com.adil.inheritence;

public class Goat extends Animal implements OnWalk {
    @Override
    public void walk() {
        System.out.println("goat is walking");

    }

    @Override
    public void speak() {
        System.out.println("goat baa");

    }

    @Override
    public void type() {
        System.out.println("Type is goat");

    }
}
