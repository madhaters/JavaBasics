package com.adil;

public class StarHandler {
    public void Trianglestar() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--)

            {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println("");
        }


    }


}
