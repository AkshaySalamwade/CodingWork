// Stream API Interview Questions and Solutions

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StreamAPIExamples {
    public static void main(String[] args) {

        // 1. Convert list of strings to uppercase
        List<String> strings = Arrays.asList("hello", "world");
        List<String> upper = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase: " + upper);



        
        // 2. Find first non-repeating character
        String input = "swiss";
        Character firstNonRepeat = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream().filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("First non-repeating: " + firstNonRepeat);

        // 3. Count character frequency
        String freqStr = "banana";
        Map<Character, Long> freqMap = freqStr.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Char Frequency: " + freqMap);

        // 4. Square of even numbers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredEvens = nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared Evens: " + squaredEvens);

        // 5. Flatten list of lists
        List<List<String>> nested = Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("c", "d")
        );
        List<String> flatList = nested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened List: " + flatList);

        // 6. Sort custom objects
        class Employee {
            String name; int salary;
            Employee(String name, int salary) { this.name = name; this.salary = salary; }
            public String toString() { return name + ":" + salary; }
        }
        List<Employee> employees = Arrays.asList(
            new Employee("John", 3000),
            new Employee("Jane", 4000),
            new Employee("Doe", 2000)
        );
        List<Employee> sortedBySalary = employees.stream()
            .sorted(Comparator.comparingInt(e -> e.salary))
            .collect(Collectors.toList());
        System.out.println("Sorted by Salary: " + sortedBySalary);

        // 7. Group by department
        class Emp {
            String name, dept;
            Emp(String name, String dept) { this.name = name; this.dept = dept; }
            public String toString() { return name; }
        }
        List<Emp> empList = Arrays.asList(
            new Emp("Alice", "HR"),
            new Emp("Bob", "Tech"),
            new Emp("Charlie", "HR")
        );
        Map<String, List<Emp>> grouped = empList.stream()
            .collect(Collectors.groupingBy(e -> e.dept));
        System.out.println("Grouped by Dept: " + grouped);

        // 8. Second highest salary
        Integer secondHighest = nums.stream().distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1).findFirst().orElse(null);
        System.out.println("Second highest: " + secondHighest);

        // 9. Palindrome strings
        List<String> words = Arrays.asList("madam", "hello", "level", "world");
        List<String> palindromes = words.stream()
            .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
            .collect(Collectors.toList());
        System.out.println("Palindromes: " + palindromes);

        // 10. Reverse a string using Stream
        String revStr = "stream";
        String reversed = new StringBuilder(revStr).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
