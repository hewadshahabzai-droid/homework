
package arya;

import java.util.Scanner;


public class Arya {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        double area;
        
        System.out.println("Enter a value for raduis");
        double raduis = input.nextDouble();
        
        area = raduis * raduis * 3.14;
        
        System.out.println("The area for the circle of raduis\t" +raduis+"\tis\t"+area);
        
        
        
        
        
        
        
        
        
    }
    
}
