package com.adil.inheritence;

public class Cow extends Animal implements OnWalk {
    @Override
    public void walk() {

    }

    @Override
    public void speak() {
        System.out.println("cow b0w");

    }

    @Override
    public void type() {
        System.out.println("Type is cow");

    }
}
