package com.adil.Abstract;

public class Main {
    public static void main(String[] args) {

        Anonymous obj = new Anonymous() {
            @Override
            public void walk() {
                System.out.println("dsshf");

            }
        };

        obj.walk();
        Anonymous obj2 = new Anonymous() {
            @Override
            public void walk() {
                System.out.println("2");
            }
        };
        obj2.walk();
    }
}
