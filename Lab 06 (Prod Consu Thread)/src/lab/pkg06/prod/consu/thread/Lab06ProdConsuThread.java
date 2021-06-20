package lab.pkg06.prod.consu.thread;
/**
 *
 * @author Md. Yasin Aziz 17201019
 */
public class Lab06ProdConsuThread {
    public static void main(String[] args) throws InterruptedException {
        process p = new process(); 
 
        My_Thread t1 = new My_Thread ("Producer No. ", p);
        My_Thread2 t2 = new My_Thread2 ("Consumer No. ", p);

        t1.start(); 
        t2.start(); 

    }
}














//Backups


//        Thread t1 = new Thread(new Runnable() { 
//            @Override
//            public void run() 
//            { 
//                try { 
//                    p.produce(); 
//                } 
//                catch (InterruptedException error) { 
//                    error.printStackTrace(); 
//                } 
//            } 
//        }); 
  
//        Thread t2 = new Thread(new Runnable() { 
//            @Override
//            public void run() 
//            { 
//                try { 
//                    p.consume(); 
//                } 
//                catch (InterruptedException error) { 
//                    error.printStackTrace(); 
//                } 
//            } 
//        }); 


