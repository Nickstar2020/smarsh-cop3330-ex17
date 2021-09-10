/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //prompt for men/women
        System.out.println("enter 1 if male, 2 if female");
        int formula = scan.nextInt();

        double r = formula == 1? 0.73 : 0.66;

        //ask for how much alcohol
        System.out.println("how much alcohol have you had? (ounces)");
        int A = scan.nextInt();

        //ask for weight in pounds
        System.out.println("what is your weight in pounds?");
        int W = scan.nextInt();

        //ask for how long it's been since last drink
        System.out.println("How long ago did you drink in hours?");
        int H = scan.nextInt();

        //do math for BAC
        double BAC = (A * 5.14 / W * r ) - 0.015 * H;

        //determine if legal to drive
        System.out.println("Your BAC is " + String.format("%.6f", BAC));
        String message = BAC < 0.08 ? "It is legal to drive." : "It is not legal to drive";
        System.out.println(message);
    }
}
