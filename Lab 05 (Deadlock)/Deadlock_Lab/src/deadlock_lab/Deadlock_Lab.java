package deadlock_lab;
import java.util.Scanner;
/**
 *
 * @author 17201019
 */
public class Deadlock_Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please input the amount of processes? ");
        int p = sc.nextInt ();
        System.out.println ("Please input the amount of resources? ");
        int r = sc.nextInt();
        
        int [][] allocation = new int [p][r];
        int [][] max = new int [p][r];
        int [][] need = new int [p][r];
        int [] work = new int [r];
        int [] available = new int [r];
        boolean [] finish = new boolean [p]; 
        int seequence [] = new int [p];
        
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                System.out.println ("Please Input instance for process number " + i);
                int input = sc.nextInt();
                allocation [i] [j] = input;
            }
        }
        
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                System.out.println("Please Input Max instance for process number " + i);
                int input = sc.nextInt();
                max[i][j] = input;
            }
        }
        
        for (int i = 0; i < r; i++) {
            System.out.println ("Enter available instance for resource number " + i);
            int input = sc.nextInt();
            available [i] = input;
            work [i] = input;
        }
       
        
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                need[i][j] = max [i][j] - allocation [i][j];
            }
        }
        
 
        /* calcultaion of work finish need work */
        /* 0 1 0 2 0 0 3 0 2 2 1 1 0 0 2 7 5 3 3 2 2 9 0 2 2 2 2 4 3 3 3 3 2 */
        
        int countFinal = 0;
        int seqCount = 0;
        while (countFinal < p) {
        for (int i = 0; i < p; i++) {
            if (finish [i] == false){
                int count = 0;
                for (int j = 0; j < r; j++) {
                    if (need [i][j] <= work [j]) {
                    count++;
                    }
                }
                if (count == 3) {
                    for (int k = 0; k < r; k++) {
                       int plus = allocation [i][k] + work [k]; 
                       work [k] = plus;
                    }
                finish [i] = true;
                countFinal++;
                seequence [seqCount] = i;
                seqCount++;
                }
            }
        }
        }
        
        System.out.print ("\n\n");
        for (int i : work) {
            System.out.print (i + " ");
        }
        System.out.println ("\n\n\nEND :) \n\nThe Sequence Is: ");
        for (int i : seequence) {
            System.out.print(i + " ");
        }
        
        
        
        
    }
    
}

