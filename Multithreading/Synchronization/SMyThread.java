package Synchronization;

public class SMyThread extends Thread {
    
  private Counter counter;

    public SMyThread(Counter counter){
        this.counter = counter;
    }


    @Override
    public void run() {
        
        for(int i=0;i< 1000;i++){
            counter.increment();
        }
    }


}
