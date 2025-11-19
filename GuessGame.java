
package guess.game;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int num = (int)(Math.random()*100);
        System.out.println("enter a number between (0-100)");
     int guess = input.nextInt();
     while(true){
         if(guess==num){
             System.out.println("your guess is " + guess +" and the number is "+ num +" and you are  correct ");
         break;
     }
        else if(guess>num){
         System.out.println("your guess too high");
     }
     else if(guess<num){
         System.out.println("your guess too low");
     } 
         
     
     
     
     
     
     
     
     }
        
        
        
        
        
        
        
        
        
        
    }
    
}
