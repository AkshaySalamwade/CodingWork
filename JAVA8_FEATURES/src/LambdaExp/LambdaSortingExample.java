package LambdaExp;

import java.util.*;
import java.util.List;

public class LambdaSortingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Steve");

        // Sorting using a lambda expression
        names.sort((String a, String b) -> a.compareTo(b));

        // Alternatively, you can use method reference for a more concise syntax
        // names.sort(String::compareTo);

        // Print the sorted list
        names.forEach(name -> System.out.println(name));
    }
}
