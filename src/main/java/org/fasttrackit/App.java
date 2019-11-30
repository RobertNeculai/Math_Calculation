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
    System.out.println("Quick Maths ");
    NumberInitialiser numberInitialiser=new NumberInitialiser();
    x=numberInitialiser.getNumbers();
    y=numberInitialiser.getNumbers();
    z=numberInitialiser.getExponential();
    QuickMaths exA = new QuickMaths();
    exA.Maths(x,y,z);
    }
}
K