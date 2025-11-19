
package greatestcommondivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("enter the first number ");
    int num1 = input.nextInt();
    System.out.println("enter the second number ");
    int num2 = input.nextInt();
    int d = Math.min(num1, num2);
    while(d>0){
        if(num1%d==0 && num2%d==0){
            System.out.println("the greatest common divisor is " + d);
            break;
        }
    d--;
    }
        
    
    
    
        
        
        
        
        
        
        
    }
    
}
