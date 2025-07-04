package countdown_latch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// we use this when we want to wait

public class CountDown {

    public static void main(String[] args) throws InterruptedException {
        
        int numberOfService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfService);
        CountDownLatch latch = new CountDownLatch(numberOfService);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await();  // Main method will wait here for execution
        
        System.out.println("Main");
        executorService.shutdown();



    }
    
}

class DependentService implements Callable<String> {

    private final CountDownLatch latch;

     public DependentService( CountDownLatch latch){
        this.latch = latch;
     }



    @Override
    public String call() throws Exception {
        try{
        System.out.println(Thread.currentThread().getName()+ "Service Started...");
        Thread.sleep(2000);
        }
        finally{
        latch.countDown();
        }
        return "Ok fine";
    }

}
