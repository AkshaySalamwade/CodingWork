package JAVA_CODES;

import java.util.HashSet;
import java.util.Set;

//2.find the length of longest substring without repeating characters 

public class LongestSubString {

 public static void main(String[] args) {   

  String s = "pwwkew"; 
  
  Set<Character> set = new HashSet<>();
  int count = 0;
  int maxLenth = 0;

  for(int i=0; i<s.length();i++){

    
    if(set.contains(s.charAt(i))){
           System.out.println(set);
           maxLenth = Math.max(maxLenth,count);
           set.clear();
           count=0;
    }
        System.out.println(s.charAt(i));
        set.add(s.charAt(i));
        System.out.println(set);
        count++;
    
  }
  maxLenth = Math.max(maxLenth,count);
  System.out.println("Length of Longest SubString is "+maxLenth);

 }
     
}