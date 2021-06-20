package lab_thread;
/**
 *
 * @author 17201019
 */
public class My_Thread extends Thread {
    
    String threadName;
    public int i = 0;

    public My_Thread(String name) {
        threadName = name;
        if (threadName == "run1"){ i = 1;}
        if (threadName == "run2"){ i = 2;}
        if (threadName == "run3"){ i = 3;}
    }
    
    
    
    @Override
    public void run(){
        System.out.println ("Thread Starting Number: " + i);
        
        if (i == 1) {
            for (int j = 0; j <= 10; j++) {
                System.out.println (j);
            }
        }
        
        if (i == 2) {
            for (int j = 11; j <= 20; j++) {
                System.out.println (j);
            }
        }
        
        if (i == 3) {
            for (int j = 21; j <= 30; j++) {
                System.out.println (j);
            }
        }
    
    }

    
}


//kick it if u wanna break it kick it if you wanna make it last Oh.