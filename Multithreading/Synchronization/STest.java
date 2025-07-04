package Synchronization;

public class STest {
    
    public static void main(String[] args) {
    
        Counter counter  = new Counter();   // Single resorce handle by two thread T1 and T2
        SMyThread t1 = new SMyThread(counter);
        SMyThread t2 = new SMyThread(counter);
        /*
         * Here Sigle object counter between two threads to there may a chance to get incorrect results.
         * so we will use synchronized on critical section
         * 
         * Critical Section - part of code where shared resources are accessed and modify here in this case increament method.
         * 
         */
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            
        }
        // we have used Join before this to complete the execution of t1 and t2 or else it print the value at any instances
        System.out.println(counter.getCount());
    }
}
