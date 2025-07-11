package countdown_latch;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public interface Main {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
       ExecutorService executorService =  Executors.newFixedThreadPool(3);

        Future<String> future1 =  executorService.submit(new DependentService());
       
        Future<String> future2 =  executorService.submit(new DependentService());
       
        Future<String> future3 =  executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();

        // we want our main thread to wait untils all dependetnt services completes its executions
        // so here we can use the countdownlatch.

        System.out.println("All dependent service finished. Starting main Service....");
        executorService.shutdown();

    }
}


class DependentService implements Callable<String> {

    @Override
    public String call() throws Exception {
        
        System.out.println(Thread.currentThread().getName()+ "Service Started...");
        Thread.sleep(2000);
        return "Ok fine";
    }

}
