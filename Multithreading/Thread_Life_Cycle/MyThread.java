package Thread_Life_Cycle;

/*
 
Thread Life Cycle :

NEW : A Thread is in this state when it is created but not yet started.

RUNNABLE: After the start Method is called, the thread becomes runnable .Its ready to run and is waiting for CPU time.

Running : The thread is in this state when it is executings 

BLOCK/WAITING : A Thread is in this state when it is waiting for a resource or for another thread to perform an action.

TERMINATED : A Thread us un this state when it has finished executing.



 */



public class MyThread extends Thread {
    
   @Override
   public void run() {
     System.out.println("Runinng......");
     try {
        Thread.sleep(2000); // pause / sleep T1 thread for 2 seconds
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
   }



    public static void main(String[] args) throws InterruptedException {
        
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(500); // sleep/pause the main Thread for 1 Second
        System.out.println(t1.getState());

        t1.join(); // Main Thread wait t1 to get die or terminated 
        System.out.println(t1.getState());



    }



}
