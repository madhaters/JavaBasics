package com.adil;


import com.adil.arrays.HandleArrays;
import com.adil.calculator.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public void mainMenu() {
        int choiceNumber = 0;

        do {
            try {
                System.out.println("Welcome to Madhatters Learners");
                System.out.println("Choose program to Test");
                System.out.println("1.Handler Arrays");
                System.out.println("2.Test Calculator");
                System.out.println("3.Test star print");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");


                Scanner sc = new Scanner(System.in);
                choiceNumber = sc.nextInt();
                if (choiceNumber > 3) {
                    throw new InputMismatchException("Option not in menu.");
                }
                switch (choiceNumber) {
                    case 1:
                        HandleArrays hs = new HandleArrays();
                        hs.mainManu();
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
            } catch (InputMismatchException ex) {
                System.out.println("plz enter the valid input number");
            }
        } while (choiceNumber != 0);

/*catch (InputMismatchException ex){
    System.out.println("plz enter the valid input number");
}*/
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.mainMenu();


    }
}
