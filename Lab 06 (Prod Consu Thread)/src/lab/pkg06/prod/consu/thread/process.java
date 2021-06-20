package lab.pkg06.prod.consu.thread;
import java.util.*;

public class process {

    LinkedList<Integer> list = new LinkedList<>(); //Using LList DS For Better Flexibility.
    int capacity = 2;

    public void produce() throws InterruptedException { //When a produce gets called.
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    wait(); // when size is full, we put it to wait ();
                }

                System.out.println("Produced Value Is: "+ value);
                list.add(value++); //adding value to the buffer (LList)
                notify(); //notify consumer thread to start it's works

                Thread.sleep(1000); //To run the program in a rigid way
            }
        }

    }
    
    public void consume() throws InterruptedException { //When consume gets called.
        while (true) {
            synchronized (this) {
                while (list.size() == 0) {
                    wait(); // When size is 0. Nothing to consume. 
                }

                int val = list.removeFirst(); // remove items in FIFO Format. Default LLIST method.
                System.out.println("Consumed Value Is: "+ val);
                notify(); //notify producer thread to start

                Thread.sleep(1000);
            }
        }
    }
    
    
}
