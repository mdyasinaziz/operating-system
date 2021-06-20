package lab.pkg03;
import java.util.*;
import java.util.stream.*;
/**
 *
 * @author Yasin
 */
public class SJF_Premp {
    
    public void run () {
    Scanner sc = new Scanner (System.in);
        System.out.println ("How Many Processes? ");
        int n = sc.nextInt();
        int bt [] = new int [n];
        int bt2 [] = new int [n];
        int at [] = new int [n]; 
        int wt [] = new int [n];
        int tt [] = new int [n];
        int ct [] = new int [n];
        
        //take inputs of Burst Time
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Burst Time of Process No: " + (i+1));
            int x = sc.nextInt();
            bt [i] = x;
            bt2 [i] = x;
        }
        
        //take inputs of Arrival Time
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Arrival Time of Process No: " + (i+1));
            int x = sc.nextInt();
            at [i] = x;
        }
        
        int atcounter = 0;
        int timer = 0;
        int ite = 0;
        for (int i = 0; i >= 0; i++) {
            int status = IntStream.of(bt2).sum();
            if (status == 0){
            break;
            }

            for (int j = 0; j < at.length; j++) {
                if (timer == at[j]) {
                atcounter = j;
                }
            }
            
            int minX = Integer.MAX_VALUE;
            int k = 0;
            for (k = 0; k <= atcounter; k++) {
                if (bt2[k] != 0 && bt2[k] < minX) {
                    minX = k;
                }
            }
            if (minX > 100){minX=0;}
            

            bt2[minX] = bt2 [minX] - 1;
            //System.out.println (bt2[minX]);
            if (bt2[minX] == 0) {
            ct[minX] = timer+1;
            }
            timer++;
            
            
        }
                
        for (int i = 0; i < wt.length; i++) {
            wt[i] = ct[i] - at [i] - bt [i];
        }
        
        double avgwt = IntStream.of(wt).sum();
        double avw = avgwt/n;
        System.out.println ("Average Waiting Time Is: " + avw );
        
        
    
    
    
    
    }
    
}
