package LambdaExp;

import java.util.function.Function;

public class LambdaExp {

    private void add(int a, int b)
    {
        System.out.println(a+b);
    }


    public static void main(String[] args){
        // Define the lambda expression
        Function<String, Integer> getLength = str -> str.length();

        // Define a string value
        String input = "Hello, World!";

        // Use the lambda expression to get the length of the string
        int length = getLength.apply(input);

        // Print the result
        System.out.println("The length of the string \"" + input + "\" is: " + length);


    }
}
