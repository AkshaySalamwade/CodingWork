
Executor Framework in java 

The Executor Framework is introduced in java 5 as part of the java.util.concurrent package to simplify the 
developement of concurrent appliccation by abstracting away many of the complexities involved in 
creating and managing threads.


// problems prior to the executor Framework
-manual Thread managemnt - overhead due to manual creation and deletion
-Resouce Management 
-Scalability 
-Thread Resouce
-Error Handling 

Executor Framework
- Executor
- Executor Service
- ScheduledExecutorService 


Future :
A Future represents the result of an asynchronous computation. 
Methods are provided to check if the computation is complete, 
to wait for its completion, and to retrieve the result of the computation. 
The result can only be retrieved using method get when the computation has completed,
 blocking if necessary until it is ready