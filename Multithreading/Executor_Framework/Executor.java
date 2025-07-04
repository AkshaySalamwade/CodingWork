package Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

   private static long factorial(int n){

        // We are appliing here Sleep to show factorial is high computational heavy thing which require more time.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        long result = 1;

        for(int i=1;i<=n;i++){
           result *=i;
        }


        return result;
    }

    
    public static void main(String[] args) {
        
       // long startTime = System.currentTimeMillis();
       

        ExecutorService executor  = Executors.newFixedThreadPool(9);
        // calculating the factorial of number from 1-9
        for(int i=1;i <10; i++)
        {
            int finalI = i;

               executor.submit(() -> {
                    long result  = factorial(finalI);
                    System.out.println(result);
                });

        
        }

        
        executor.shutdown();
       // System.out.println("Total Time : "+(System.currentTimeMillis()-startTime));

    }

    
}
