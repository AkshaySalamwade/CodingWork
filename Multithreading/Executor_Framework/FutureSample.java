package Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class FutureSample {
    

    /**
     * @param args
     */
    public static void main(String[] args) throws  Exception {
        
      ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<?> future =  executorService.submit(() -> "Hii, get to know about future. ");

           if(future.isDone()){
            System.out.println("Execution is completed");
           }
        
          System.out.println(future.get());
          executorService.shutdown();

    }

    @Override
    public String toString() {
        return "Future []";
    }
}
