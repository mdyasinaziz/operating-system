package lab_thread;
/**
 *
 * @author 17201019
 */
public class Driver {
        public static void main(String[] args) {
            My_Thread firstT = new My_Thread ("run1");
            My_Thread secondT = new My_Thread ("run2");
            My_Thread thirdT = new My_Thread ("run3");
            
            firstT.start();
            secondT.start();
            thirdT.start();
            
            
//        My_Thread firstT = new My_Thread ("ok1");
//        
//        My_Thread secondT = new My_Thread ("ok2");
//        
//        firstT.start();
//        secondT.start();
//            My_ThreadRunable thirdT = new My_ThreadRunable ("ok3");
//            Thread fourthT = new Thread (thirdT);
//            fourthT.start();
        
        }
}
