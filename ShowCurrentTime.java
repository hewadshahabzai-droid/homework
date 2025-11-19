
package showcurrenttime;


public class ShowCurrentTime {
    public static void main(String[] args) {
 
long totalMilliseconds = System.currentTimeMillis();

long totalSeconds = totalMilliseconds/1000;

long currentSeconds = totalSeconds%60;

long totalMinutes = totalSeconds /60;

long currentMinutes = totalMinutes %60;
 
long totalHour = totalMinutes/60;

long currentHour = totalHour%24;

        System.out.println("current time is"+currentHour+":"+currentMinutes+":"+currentSeconds+"GMT");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
