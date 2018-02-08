package com.adil.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HandleArrays {
    public void arrays() {
        System.out.println("Welcome to Array class");
        System.out.println("1.Check if Array contain a number");
        System.out.println("2.Sum the elements of array");
        System.out.println("3.Arrays in ascending order");
        System.out.println("4.Arrays in decending order");
        System.out.println("5.Make all the elements in array with zero");
        System.out.println("6.Dublicate numbers");
        System.out.println("7.Delete the elements from array");
        //  int ChoiceNumber;
        //System.out.println("Enter your choice");
        //Scanner sc=new Scanner(System.in);
        //ChoiceNumber=sc.nextInt();
    }

    int[] intArray = new int[]{1, 2, 3, 3, 5, 6, 7, 8, 8, 890};

    public void getInputs() {

        for (int i = 0; i < intArray.length; i++)
            System.out.println("Element at index " + i + " : " + intArray[i]);
        //checkNumber(1);
        //sum();
        //ascending_order();
        //decending_order();

        //dublicate_number();
        //delete();
        // elements_zero();
    }

    public void checkNumber(int number) {
        for (int searchnumber : intArray)
            if (searchnumber == number) {

                System.out.println("search number is :" + number);
                //  System.out.println("search number is:"number);
            }
    }

    public void sum() {
        int sum = 0;

        for (int number : intArray) {
            sum += number;
            //    System.out.println("sum of number is:"+number);
        }
        System.out.println("sum of number is:" + sum);
    }

    public void ascending_order() {

        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {

            System.out.print(" " + intArray[i]);

        }
        System.out.println("");

    }

    public void decending_order() {

        for (int i = intArray.length - 1; i >= 0; i--) {
            //Arrays.sort(arr); // not here
            System.out.println(" " + intArray[i]);
        }
    }

    public void elements_zero() {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 0;
            System.out.println(intArray[i]);
        }
    }

    public void dublicate_number() {


        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if ((intArray[i] == intArray[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + intArray[j]);
                }


            }

        }

    }

    public void delete() {
        System.out.println("Original Array : " + Arrays.toString(intArray));
        int removeIndex = 2;

        for (int i = removeIndex; i < intArray.length - 1; i++) {
            intArray[i] = intArray[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(intArray));
    }

    public void mainFunction() {
        int ChoiceNumber;
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        ChoiceNumber = sc.nextInt();
        switch (ChoiceNumber) {
            case 1:
                checkNumber(8);
                break;
            case 2:
                sum();
                break;
            case 3:
                ascending_order();
                break;
            case 4:
                decending_order();
                break;
            case 5:
                dublicate_number();
                break;
            case 6:
                elements_zero();
                break;
            case 7:
                delete();
                break;


        }

    }
}

