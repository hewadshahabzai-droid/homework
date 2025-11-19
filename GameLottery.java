package game.lottery;

import java.util.Scanner;

public class GameLottery {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random()*900)+100;
        

        
        System.out.println("Enter your guess (Three digits)");
        int guess = input.nextInt();
        
        System.out.println("The lottery number is = "+lottery);

        int L1 = lottery%10;
        lottery = lottery/10;
        int L2 = lottery%10;
        lottery = lottery/10;
        int L3 = lottery%10;
        
        int G1 = guess%10;
        guess = guess/10;
        int G2 = guess%10;
        guess = guess/10;
        int G3 = guess%10;

        if(L1==G1&&L2==G2&&L3==G3)
            System.out.println("You win $10,000 because you guessed the correct number!");
        
        else if((L1==G1||L1==G2||L1==G3 )&&(L2==G1||L2==G2||L2==G3 )&& (L3==G1||L3==G2||L3==G3))
                        System.out.println("You win $3,000 because all digits match but not in order!");
        
       else if(L1==G1||L1==G2||L1==G3 || L2==G1||L2==G2||L2==G3 || L3==G1||L3==G2||L3==G3)
                        System.out.println("You win $1,000 because one digits matches! ");
        
       else System.out.println("Sorry; no match");
        
    }
    
}
