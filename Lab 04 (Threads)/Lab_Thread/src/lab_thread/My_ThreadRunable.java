package lab_thread;

public class My_ThreadRunable implements Runnable{
    
    String threadName;
    
    public My_ThreadRunable(String name) {
        threadName = name;
    }
    
    @Override
    public void run () {
        
        System.out.println ("Hello World Runnable Version! ");
    
    
    }
    
    
}
