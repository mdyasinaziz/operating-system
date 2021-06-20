package lab.pkg06.prod.consu.thread;

public class My_Thread2 extends Thread {
    
    String threadName;
    public int i = 0;
    process p;
    
    public My_Thread2(String name, process p1) {
        threadName = name;
        p = p1;
    }
    
    public void run() {
        try {
            p.consume();
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
    
}
