import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample1 {

    public static void main(String[] args)
    {

        List<String> names = Arrays.asList("John", "Alice", "Bob", "Steve");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        System.out.println("Sum all the elements in a list using streams.");

        

        int output = numbers.stream().mapToInt(Integer :: intValue).sum();
        System.out.println("Sum Is : "+ output);
        System.out.println("Sum is : "+ numbers.stream().mapToInt(N -> N).sum());

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

               

        System.out.println("Sum = " + sum);

   //-----------------------------Remove Duplicates ----------------------------------------------------------
        System.out.println("Remove duplicate elements from a list using streams.");

        List<Integer> li = Arrays.asList(1,2,3,42,1,23,34,5,5,6,6,54,2,2,4,5,7,8,9,98867,5,44,3356,632);

       List<Integer>oplist =  li.stream().distinct().collect(Collectors.toList());
       System.out.println("List After Removing Duplicates : "+oplist);


    // -----------Join a list of strings into a single comma-separated string using streams.-------

      String combinedString =  names.stream().collect(Collectors.joining(","));
        names.stream().forEach(x-> System.out.print(x+","));
        System.out.println("Comma Seperated String : "+combinedString);



     // -------------- Convert a list of strings to a list of their lengths using streams.
//    List<Integer> stringLengths  = names.stream().map(x->x.length()).collect(Collectors.toList());
//    System.out.print(stringLengths);
//    names.stream().map(x->x.length()).forEach(x->System.out.print(x+","));


    //Partition a list into even and odd numbers using streams.
     List<Integer> evenNumbers = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
     List<Integer> oddNumbers = numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());

        System.out.print(evenNumbers);
        System.out.print(oddNumbers);

       
      List<Integer> combinedList = Stream.concat(evenNumbers.stream(),oddNumbers.stream())
              .collect(Collectors.toList());

      Stream.of(evenNumbers,oddNumbers)
              .flatMap(List :: stream)
              .collect(Collectors.toList());


           

      //----Get a sublist of top 3 highest numbers using streams.
       List<Integer> HighestElements = numbers.stream().sorted((a,b)->b-a).limit(3).collect(Collectors.toList());
        System.out.print(HighestElements);


      //--Find duplicate elements in a list using streams
      li.stream()
              .collect(Collectors.groupingBy(x->x,Collectors.counting()))
              .entrySet()
              .stream()
              .filter(x->x.getKey()>1)
              .map(Map.Entry::getKey)
              .collect(Collectors.toList());



        List<Integer> duplicates = li.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())) // group and count
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // find duplicates
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());



        li.stream().distinct().collect(Collectors.toList());



    }


}
