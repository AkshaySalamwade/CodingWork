package Synchronization;


public class Counter {
    
    private int count = 0;
    private int wscount = 0;

    // Critical Section - shrared resoues access or modified here ...
    public synchronized void increment(){
        count++;
    }
 
     public int getCount(){
        return count;
     }

     public void increamentWithoutSync(){
        wscount++;
        
     }

     public int getCountWithoutSync(){
        return wscount;
     } 

}
