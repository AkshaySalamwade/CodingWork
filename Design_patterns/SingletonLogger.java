package Design_patterns;

class Logger{

 // create a static instance-----
  private static Logger instance;

  // make a constructor private to restrict instantiation....
  private Logger(){
    System.out.println("Logger instatiated......");
  }

  //Provide a public method to get the instance 

  public static Logger getInstance(){
 
     if(instance == null)
     {
        instance = new Logger();
     }
     return instance;
  }

  public void log(String message){
    System.out.println("Log :"+message);
  } 


}




public class SingletonLogger {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        logger1.log("Log using Loagger1");
        logger2.log("Log using Loagger2");

        System.out.println(logger1 == logger2);
       
       // Both the objects return a same instances 
      //  System.out.println(logger1.getInstance().hashCode());
      //System.out.println(logger2.getInstance().hashCode());

        
    }
    
}
