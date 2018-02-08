package com.adil;

public class StarHandler {
    public void triangleStar(int a) {


        for (int i = 1; i <= a; i++) {

            for (int j = a; j >= i; j--) {

                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }

            System.out.println();

        }

    }
}


