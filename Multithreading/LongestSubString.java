import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

 public static void main(String[] args) {   

  String s = "dvdf"; 
  
  Set<Character> set = new HashSet<>();
  int count = 0;
  int maxLenth = 0;

  for(int i=0,j=0; i<s.length();i++){    
    if(set.contains(s.charAt(i))){
           System.out.println(set);
            j++;
            i=j;
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
