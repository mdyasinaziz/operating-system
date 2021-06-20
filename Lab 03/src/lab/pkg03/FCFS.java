package lab.pkg03;
import java.util.Scanner;
/**
 *
 * @author Yasin
 */
public class FCFS {
    
    
    public void run () {
        Scanner sc = new Scanner (System.in);
        System.out.println ("How Many Processes? ");
        int n = sc.nextInt();
        int bt [] = new int [n]; 
        int waitingTime [] = new int [n];
        int tt [] = new int [n];
        
        //take inputs
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Burst Time of Process No: " + (i+1));
            int x = sc.nextInt();
            bt [i] = x;
        }
        
        //find waiting time
        for (int i = 1; i < n; i++) {
            waitingTime [i] = bt[i-1] + waitingTime [i-1];
        }
        
        //find turnaround time
        for (int i = 0; i < n; i++) {
            tt[i] = waitingTime[i] + bt[i];
        }
        
        //avg burst time
        double avgtt = 0;
        for (int i = 0; i < n; i++) {
            avgtt = avgtt + tt [i];
        }
        avgtt = avgtt/n;
        
        //avg wt time
        double avgwt = 0;
        for (int i = 0; i < n; i++) {
            avgwt = avgwt + waitingTime [i];
        }
        avgwt = avgwt/n;
        
        System.out.println ("Avg Turn Around Time: " + avgtt);
        System.out.println ("Avg Waiting Time: " + avgwt); 
}
    
}
