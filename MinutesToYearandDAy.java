package minutestoyearandday;

import java.util.Scanner;

public class MinutesToYearandDAy {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number for Minutes");
        int minutes = input.nextInt();
        
        int days = minutes / 1440;
        int years = days/365;
        int remainingDays = days % 365;
        
        System.out.println(minutes+"\tminutes is approximately\t" +years+ "years and\t"+ remainingDays + "days.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
    }
    
}
