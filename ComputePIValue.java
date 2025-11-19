package compute.pi.value;

public class ComputePIValue {

    public static double m(int i){
        double sum = 0;
        for(int n=1;n<=i;n++){
        sum+=4*Math.pow(-1, n+1)/(2*n-1);
        }
        return sum;
    
    }


    public static void main(String[] args) {

         System.out.println("i\tm(i)");
         for(int i=1;i<=901;i+=100){
             System.out.printf("%d\t%.4f%n", i, m(i));
         
           }
    }






    
}
