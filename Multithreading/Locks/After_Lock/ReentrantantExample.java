
package Locks.After_Lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class ReentrantantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();

        try{
            System.out.println("Outer Method Lock");
            innerMethod();

        }
        catch(Exception e){

        }
        finally{
            lock.unlock();
        }

    }

     public void innerMethod(){
        
        lock.lock();
        try{
            System.out.println("Inner Method Lock....");
        }
        finally{
            lock.unlock();
        }
        
    }


    public static void main(String[] args) {
        
        ReentrantantExample example = new ReentrantantExample();
        example.outerMethod();

    }


}