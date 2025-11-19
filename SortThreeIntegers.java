
package sortthreeintegers;

import java.util.Scanner;

public class SortThreeIntegers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the number a");
        a = input.nextInt();
        System.out.println("Enter the number b");
        b = input.nextInt();
        System.out.println("Enter the number c");
        c = input.nextInt();

        System.out.println();
        
       if(a<b&&a<c&&b==c)
            System.out.println(b+" "+c+" "+a);
         
       else if(a>b&&a>c&&b==c)
             System.out.println(a+" "+b+" "+c);
         
       else if(b>a&&b>c&&a==c)
             System.out.println(b+" "+a+" "+c);
          
       else if(c>b&&c>a&&b==a)
             System.out.println(c+" "+b+" "+a);
         
       else if(b<a&&b<c&&a==c)
            System.out.println(a+" "+c+" "+b);
         
       else if(c<b&&c<a&&a==b)
            System.out.println(b+" "+a+" "+c);
        
       else if(a>b && a>c && b>c )
            System.out.println(a+" "+b+" "+c);
       
       else if(a>b && a>c && c>b )
            System.out.println(a+" "+c+" "+b);
        
       else if(b>a && b>c && a>c)
            System.out.println(b+" "+a+" "+c);
        
       else if(b>a && b>c && c>a )
            System.out.println(b+" "+c+" "+a);
        
       else if(c>a && c>b && a>b)
            System.out.println(c+" "+a+" "+b);
        
       else if(c>a && c>b && b>a )
            System.out.println(c+" "+b+" "+a);
        
       else if (a==b && a==c)
            System.out.println(a+" "+b+" "+c);
        
    }
    
    
}
