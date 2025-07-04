package JAVA_CODES;

import java.util.*;

/*
 * 5. Program to Print Only Unique Characters in a String
 * or we can say program to print non repeasting charater in String 
 */

public class UniqueCharInString {


    public static void main(String[] args) {
       
    String s1 = "akshaysh";

    Map<Character, Integer> map = new HashMap<>();

    for(int i=0;i<s1.length();i++){

        map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
    }

  
      for(Map.Entry<Character,Integer> entry : map.entrySet()){

          if(entry.getValue() == 1){
            System.out.println(entry.getKey());
          }

      }  

      for(Character Key : map.keySet()){

          if(map.get(Key) == 1)
          {
            System.out.println(Key);
          }
        

      }


    

    }

 



    
}
