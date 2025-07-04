
/* Description 
 * A new class sunThreadRun is created that extends Runnable Interface 
 * The run Method is Overridden to define the code that constitute the new class
 * Thread object is created by passing the instance of myRUnnable
 * Start Method is called on the Thread object toinnitiate the new Thread 
 * 
 */




public class subThreadRun  implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
  
            System.out.println(Thread.currentThread().getName());
            
        }
    }
    
}
