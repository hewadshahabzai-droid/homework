package thebiggestcommonqasim;

import java.util.Scanner;

public class TheBiggestCommonQasim {
    public static void main(String[] args) {
        
        
         Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for a");
        int a = input.nextInt();
        System.out.println("Enter a number for b");
        int b = input.nextInt();
        
        int c = a*b;
        
        for(int i = 1;i<=c;i++)
        if(i%a==0 && i%b==0){
                System.out.println("The answer is " +i);
                        break;

        }
        
        
        
    }
    
}
