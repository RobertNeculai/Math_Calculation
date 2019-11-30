package org.fasttrackit;

import java.util.Scanner;

public class NumberInitialiser {
public int getNumbers() {
    int number = givennumber();
    System.out.println("Number: " + number);
    return number;
}
    public int getExponential() {
        System.out.println("Exponential: ");
        int number = givennumber();
        System.out.println("Exponential is : " + number);
        return number;
    }

    private int givennumber()
    {
        System.out.println("Please enter number : ");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
