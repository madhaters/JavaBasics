package com.adil.anonymous1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int input = 0;


        OnItemClickList onItemClickList = new OnItemClickList() {
            @Override
            public void onClick() {
                System.out.println("Onclick");


            }
        };
        System.out.println("please input the number");
        System.out.print("1:onclick");
        do {


            try {


                //  int input;
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                if (input > 1) {
                    throw new InputMismatchException("Option not in menu.");
                } else if (input == 1) {
                    onItemClickList.onClick();


                }
            } catch (Exception ex) {

                System.out.println("please input the valid input");
            }
        } while (input != 1);
    }
}
