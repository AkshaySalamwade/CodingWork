package Synchronization;

public class WsTest {
    

public static void main(String[] args) throws InterruptedException {
    
Counter counter = new Counter();

WsMyThread t1  = new WsMyThread(counter);
WsMyThread t2 = new WsMyThread(counter);

t1.start();
t2.start();

t1.join();
t2.join();

System.out.println(counter.getCountWithoutSync());


}

}
