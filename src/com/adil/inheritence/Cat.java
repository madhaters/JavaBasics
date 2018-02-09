package com.adil.inheritence;

public class Cat extends Animal implements OnWalk {
    @Override
    public void walk() {
        System.out.println("cat is walking");

    }

    @Override
    public void speak() {
        System.out.println("Cat mew");
    }

    @Override
    public void type() {
        System.out.println("Type is cat");

    }
}
