package com.adil.inheritence;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choiceNumber = 0;
        do {
            try {


                System.out.println("1:Dog");
                System.out.println("2:Goat");
                System.out.println("3:Cow");
                System.out.println("4:Cat");
                System.out.println("0:Exit");

                System.out.print("Enter your choiceNumber");
                Scanner sc = new Scanner(System.in);
                choiceNumber = sc.nextInt();
                if (choiceNumber > 4) {
                    throw new InputMismatchException("Option not in menu.");
                }
                switch (choiceNumber) {
                    case 1:
                        Dog dg = new Dog();
                        dg.type();
                        dg.speak();
                        dg.walk();
                        break;
                    case 2:
                        Goat g = new Goat();
                        g.type();
                        g.speak();
                        g.walk();
                        break;
                    case 3:
                        Cow c = new Cow();
                        c.type();
                        c.speak();
                        c.walk();
                        break;
                    case 4:
                        Cat cw = new Cat();
                        cw.type();
                        cw.speak();
                        cw.walk();
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("please enter the valid input");

            }
        } while (choiceNumber != 0);
    }

}
