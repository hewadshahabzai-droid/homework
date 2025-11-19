package solvequadraticequations;

import java.util.Scanner;

public class SolveQuadraticEquations {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the a number");
        double a = input.nextDouble();
        System.out.println("Enter the b number");
        double b = input.nextDouble();
        System.out.println("Enter the c number");
        double c = input.nextDouble();
        
        double delta = Math.pow(b*b-4*a*c, 0.5);
        
        double X1 = (-b+delta)/2*a;
        double X2 = (-b-delta)/2*a;
        double X = (-b/2*a);
        if(delta>0)
            System.out.println("X1 = "+X1+" and X2 = "+X2);
        
        else if(delta==0)
            System.out.println(" X = "+X);
        
        else
            System.out.println("it doesn't have roots");
        
        
    }
    
}
