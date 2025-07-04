
/*
 * Thread V/s Runnable 
 * 
 * When there is IS-A Relationhip then in that case we use Runnable because Java does not support multiple Inheritance
 * If Class B extends A then we can not extends with Thread class so in that case we can use Runnable Interface
 * 
 * 
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        
            System.out.println("Thread is Running --------");

            try {
                Thread.sleep(2000);  // 
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }

    }


    public static void main(String[] args) throws InterruptedException {
        
        System.out.println(Thread.currentThread().getName()+" is Currently  Working----");
         MyThread t1 = new MyThread();
         System.out.println(t1.getName()+"--"+t1.getState());  // NEW State becuase start Method is not called yet..

         t1.start();    // New to Running State waiting for the task to Assign 
         System.out.println(t1.getState());
         Thread.sleep(500);    // Stop the main thread to give time to run the T1
         System.out.println(t1.getState()); 
         t1.join();  // Main Thread is waitng Thread T1 to die ( Complete it Task)
         System.out.println(t1.getState());
         


    }
    
}
