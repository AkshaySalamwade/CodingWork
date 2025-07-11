package Locks.Before_Lock;

public class Main {

    public static void main(String[] args) {
        
        BankAccount sbiAccount = new BankAccount();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                
                try {
                    sbiAccount.withdraw(50);

                } catch (InterruptedException e) {
                  
                    e.printStackTrace();
                }
                
            }
            
        };

            Thread t1 = new Thread(task, "Thread 1");
            Thread t2 = new Thread(task, "Thread 2");

            t1.start();
            t2.start();



    }
    
}
