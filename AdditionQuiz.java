
package additionquiz;

import java.util.Scanner;

public class AdditionQuiz {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        
        System.out.println("What is  "+num1+"-"+num2+"?");
        
        int answer = input.nextInt();   
        System.out.println(num1+" - "+num2+" = "+answer+" is "+(num1-num2==answer));
    }
    
}
