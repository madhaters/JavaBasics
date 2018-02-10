package com.adil.anonymous1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int input = 0;
        OnItemClickList onItemClickList = new OnItemClickList() {
            @Override
            public void onClick(int i) {
                System.out.println("input number is" + i);


            }
        };
        System.out.println("please input the number");


        do {


            try {


                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                onItemClickList.onClick(input);


            } catch (Exception ex) {

                System.out.println("please input the valid input");
            }
        } while (input != 1);
    }
    }

