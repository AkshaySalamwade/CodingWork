package JAVA_CODES;

import java.util.HashMap;

// java code to count the Occurances---->

public class Count_occurances {


    public static void main(String[] args) {
        
    
     String s1 = "akshay";

     int[] arr = {1,3,4,2,1,2,3,4,5,6,3,1,2,4};

   
      HashMap<Character, Integer> stringCharCount = new HashMap<>();
      HashMap<Integer, Integer> arrCharCount = new HashMap<>();

        
      // for(int i=0;i<s1.length();i++){

      //   stringCharCount.put(s1.charAt(i), stringCharCount.getOrDefault(s1.charAt(i), 0)+1);

      // }

      for(char ch : s1.toCharArray()){
        stringCharCount.put(ch, stringCharCount.getOrDefault(ch, 0)+1);
      }



      for(int i=0;i<arr.length;i++){

        arrCharCount.put(arr[i], arrCharCount.getOrDefault(arr[i], 0)+1);
        

      }

     
      System.out.println(stringCharCount);
      System.out.println(arrCharCount);


    }   

}
