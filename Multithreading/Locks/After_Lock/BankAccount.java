package Locks.After_Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

private int balance  = 100;

private final Lock lock = new ReentrantLock();


public  void  withdraw(int amount){

    System.out.println(Thread.currentThread().getName()+ " attempting to  withdraw  "+amount);

try{   
    if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
 
        if(balance >= amount){

            try{
                System.out.println(Thread.currentThread().getName()+ " Proceeding with withdrawals....");
                Thread.sleep(5000);
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+ " Completed Withdrawal. Remaining Balance is :"+balance);

            }
            catch(Exception e){
                    Thread.currentThread().interrupt();
            }
            finally{
                lock.unlock();
            }            
        }
        else{
                    System.out.println(Thread.currentThread().getName()+ " Sooory Insufficient Balance !");
        }


    }
    else{
         System.out.println(Thread.currentThread().getName()+ " Could not aquire the lock, will try lated");    
    }
}
    catch(Exception e){
        Thread.currentThread().interrupt();
    }


}

    
}
