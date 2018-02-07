package com.adil.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private float numberOne;
    private float numberTwo;
    private float result;

    public void getInputs() {
        try {
            System.out.print("Input number one: ");
            Scanner scanner = new Scanner(System.in);
            numberOne = scanner.nextFloat();
            System.out.println();
            System.out.print("Input second number: ");
            numberTwo = scanner.nextFloat();

            showMainMenu();
        } catch (InputMismatchException ex) {
            System.out.println("Please input valid number:");
            getInputs();
        }

    }

    public void showMainMenu() {
        System.out.println("what would you like to do with the numbers");
        System.out.println("1 plus");
        System.out.println("2 subtract");
        System.out.println("3 multiply");
        System.out.println("4 divide");
        int choice;
        System.out.println("Enter your choice");
        Scanner sg = new Scanner(System.in);
        choice = sg.nextInt();
        switch (choice) {
            case 1:
                result = add();
                break;
            case 2:
                result = subtract();
                break;
            case 3:
                result = multiply();
                break;
            case 4:
                result = divide();
                break;
            default:
                System.out.println("incorrect number");
        }
        System.out.println(result);
        System.out.println("Thanks for using our calculator");


    }

    private float add() {
        return numberOne + numberTwo;
    }

    private float subtract() {
        return numberOne - numberTwo;
    }

    private float multiply() {
        return numberOne * numberTwo;
    }

    private float divide() {
        return numberOne / numberTwo;
    }


}

