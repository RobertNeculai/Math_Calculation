package org.fasttrackit;

public class QuickMaths {
    public void Maths(int a, int b,int c) {
        System.out.println("The sum of " + a + " + " + b + " is " + Sums(a, b));
        System.out.println("Substract of " + a + " and " + b + " is " + Substract(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is " + Multiplication(a, b));
        System.out.println("Division of " + a + " and " + b + " is " + Division(a, b));
        System.out.println("Square root of "+Multiplication(a,b)+" is "+Math.sqrt(Multiplication(a,b)));
        System.out.println("Exponential of "+Multiplication(a,b)+" by "+c+" is "+Exponential(Multiplication(a,b),c));


    }

    private int Sums(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    private int Substract(int a, int b) {
        int s;
        if (a > b || a == b)
            s = a - b;
        else {
            s = b - a;
            s = s * (-1);
        }
        return s;
    }

    private double Multiplication(int a, int b) {
        double m;
        m = a * b;
        return m;
    }

    private double Division(int a, int b) {
        double d;
        d = a / b;
        return d;
    }
    private double Exponential(double a,int b) {
        double e=1;
        for(int c=0;c<b;c++)
            e=e*a;
        return e;
    }
}
