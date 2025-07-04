package Synchronization;

public class WsMyThread extends Thread{

    private Counter counter;

    public WsMyThread(Counter counter){

        this.counter = counter;
    }

    @Override
    public void run() {
        
        for(int i=0;i<1000;i++){
            counter.increamentWithoutSync();
        }
    }
    
}
