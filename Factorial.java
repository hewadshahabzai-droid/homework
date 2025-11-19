
package factorial;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    System.out.println("enter a number to calculte the factorail ");
    int a = input.nextInt();
        
        System.out.println(factorial(a));
    }
    
public static int factorial(int n){
   int fact = 1;
    while(n>=1){
       fact = fact*n;
       n--;
    }
    return fact;
}










    
}
