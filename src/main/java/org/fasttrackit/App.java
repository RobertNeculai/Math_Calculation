package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    int x,y,z;
    double a,b,c;
    System.out.println("Quick Maths ");
    NumberInitialiser numberInitialiser=new NumberInitialiser();
    x=numberInitialiser.getNumbers();
    y=numberInitialiser.getNumbers();
    z=numberInitialiser.getExponential();
    a=numberInitialiser.getNumbersD();
    b=numberInitialiser.getNumbersD();
    c=numberInitialiser.getExponentialD();
    QuickMaths exA = new QuickMaths();
    exA.Maths(x,y,z);
    exA.Maths(a,b,c);
    }
}