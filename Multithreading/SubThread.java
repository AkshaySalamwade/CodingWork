

/*   Description 
 * A new class subThread is created that extends Thread Class 
 * The run Method is Overridden to define the code that constitute the new class
 * Start Method is called to initiate the new Thread 
 * 
 * 
 */


public class SubThread  extends Thread{
 

     @Override
     public void run() {

         for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName());
         }

     }

    public static void main(String[] args) {
        

    }
    
}
