package lab.pkg03;
import java.util.Scanner;
/**
 *
 * @author Yasin
 */
public class SJF_NON {
    
    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println ("How Many Processes? ");
        int n = sc.nextInt();
        int [] bt = new int[n + 1];
        int [] wt = new int[n + 1];
        int [] tt = new int[n + 1];
        int [] ot = new int[n + 1];
        float avgwt = 0;
        float avgtt = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Burst Time of Process No: " + (i+1));
            bt[i] = sc.nextInt();
            ot[i] = i + 1;
        }

        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (bt[j] > bt[j + 1]) {
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;
                    temp = ot[j];
                    ot[j] = ot[j + 1];
                    ot[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            tt[i] = bt[i] + wt[i];
            wt[i + 1] = tt[i];
        }
        tt[n] = wt[n] + bt[n];

        
        //avg calculation
        for (int j = 0; j < n; j++) {
            tt[j] = wt[j] + bt[j];
            avgwt += wt[j];
        }
        avgwt = avgwt / n;

        
        for (int i = 0; i < n; i++) {
            tt[i] = wt[i] + bt[i];
            avgtt = avgtt + tt[i];
        }
        avgtt = avgtt / n;
        
        System.out.println ("Avg waiting time is: " + avgwt);
        System.out.println ("Avg turn around time is: " + avgtt);


    }
    
    
    
    
    
}
