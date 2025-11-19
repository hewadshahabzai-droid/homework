
package javaapplication4;

public class JavaApplication4 {

    private static long total;

    public static void main(String[] args) {
long totalMilliSecond = System.currentTimeMillis();
        System.out.println(totalMilliSecond);
        long totalSeconds = totalMilliSecond/1000;
        System.out.println(totalSeconds);
        long currentSecond = totalSeconds%60;
        System.out.println(currentSecond);
        long totalMinute = totalSeconds/60;
        System.out.println(totalMinute);
       long currentMinute = totalMinute%60; 
        System.out.println(currentMinute);
        long totalHour = totalMinute/60;
        System.out.println(totalHour);
        long currentHour = totalHour%24;
        System.out.println(currentHour);
                System.out.println( currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
    }
    
}
