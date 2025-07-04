package Wissen_code;

public class CamelCaseToUnderscore {
    
   public static void main(String[] args) {
    
     String input = "thisIsTheInput";
     String result = "";

     for(char ch : input.toCharArray())
     {
            if(Character.isUpperCase(ch)){
                 result+="_"+ch;          
  
            }
            else
             result+=ch;
     }

    System.out.println(result);

   }

}
