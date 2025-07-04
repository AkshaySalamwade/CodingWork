package JAVA_CODES;

public class MissingNumber {
    
    public static void main(String[] args) {
        
      int[] arr = {-5,-1,1,2,3,4,5,6};


      for(int i= 0; i<arr.length-1;i++){

          if(arr[i+1] - arr[i] != 1){
            System.out.println(arr[i]+1+"is missing");
          }


      }

      // another Solution  find missing number between 1 to N------>
      /*
       * 
       * public static int findMissing(int[] arr, int n) {
                    int total = n * (n + 1) / 2;
                    for (int num : arr) {
                        total -= num;
                    }
                    return total;
                }

       * 
       * 
       */






    }
}
