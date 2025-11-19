
package computing.bmi;

import java.util.Scanner;

public class ComputingBMI {

    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
    
        System.out.println("Enter your weight in pounds");
        double pounds = input.nextDouble();
        
          System.out.println("Enter your height in inch");
        double inch = input.nextDouble();
        
        double kilogram = pounds*0.453;
        double metter = inch*0.0254;
        
        double BMI = kilogram/(metter*metter);
        
        System.out.println("BMI is = "+BMI);
        
        
        
        
        
        
        
        
    }
    
}
