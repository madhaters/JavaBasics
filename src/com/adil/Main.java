package com.adil;


import com.adil.arrays.HandleArrays;
import com.adil.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public void mainMenu() {
        System.out.println("Welcome to Madhatters Learners");
        System.out.println("Choose program to Test");
        System.out.println("1.Handler Arrays");
        System.out.println("2.Test Calculator");
        System.out.println("3.Test star print");
        int choiceNumber;
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        choiceNumber = sc.nextInt();
        switch (choiceNumber) {
            case 1:
                HandleArrays hs = new HandleArrays();
                hs.arrays();
                break;
            case 2:
                Calculator ca = new Calculator();
                ca.showMainMenu();
                break;
            case 3:
                StarHandler st = new StarHandler();
                st.triangleStar(8);
                break;


        }


    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.mainMenu();

        HandleArrays hs = new HandleArrays();
        hs.mainFunction();


    }
}
