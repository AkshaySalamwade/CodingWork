
/* Description ---
 * To create a new Thread in java,
 * you can either extend the Thread class or implements the Runnable Interface
 * 
 */



public class Test {
    
  public static void main(String[] args) {
    
   System.out.println("Welcome to world of Multithreading................");
 
        // Using Thread class 
        SubThread sub = new SubThread();
        sub.start();

        // Unsing the RUnnable Interface
        subThreadRun subrun = new subThreadRun();
        Thread t1 = new Thread(subrun);
        t1.start();

   for (int i = 0; i < 1000; i++) {
        System.out.println(Thread.currentThread().getName());
   }
   


  }

}
