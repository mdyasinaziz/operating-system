package lab.pkg06.prod.consu.thread;

public class My_Thread extends Thread {
    
    String threadName;
    public int i = 0;
    process p;
    
    public My_Thread(String name, process p1) {
        threadName = name;
        p = p1;
    }
    
    @Override
    public void run() {
        try {
            p.produce();
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
    
}
