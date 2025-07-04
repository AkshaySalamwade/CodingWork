package Locks.Before_Lock;

public class BankAccount {

private int balance  = 100;


public synchronized void  withdraw(int amount) throws InterruptedException{

    System.out.println(Thread.currentThread().getName()+ " attempting to  withdraw  "+amount);

    if(balance >= amount){
       System.out.println(Thread.currentThread().getName()+ " Proceeding with withdrawals....");
       Thread.sleep(5000);
 
       balance -= amount;
       System.out.println(Thread.currentThread().getName()+ " Completed Withdrawal. Remaining Balance is :"+balance);

    }
    else{
        System.out.println(Thread.currentThread().getName()+ " Sooory Insufficient Balance !");
    }



}

    
}
