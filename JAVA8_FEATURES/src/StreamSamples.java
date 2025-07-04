import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamSamples {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Steve");
        List<String> names1 = Arrays.asList("John", "Alice", "Bob", "Steve");
        List<List<String>> innerList = Arrays.asList(Arrays.asList("amit","akshay"),Arrays.asList("Ashitosh","shivam"));
       List<String> flatMapList =innerList.stream().flatMap(List::stream).collect(Collectors.toList());
       System.out.print(innerList);
        System.out.print(flatMapList);

       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> arrayToArrayList = new ArrayList<>(Arrays.asList(array));
        System.out.print(arrayToArrayList);

        int mini = numbers.stream().min(Integer::compareTo).orElse(0);
       int maxy = numbers.stream().min((a,b)->a-b).orElse(0);
        System.out.println("Max NUmber is :"+maxy+" "+mini);



        System.out.println("Return the list of Even NUmber--------------");

        List<Integer> output =  numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(output);

        numbers.stream().filter(n -> n%2==0).forEach(System.out::print);

        numbers.stream().filter(n -> n%2==0).forEach(x-> System.out.print(x + ", "));



        // ----------------------------------------------------------------------------

       List<String> uppername =  names.stream().map(String :: toUpperCase).collect(Collectors.toList());
       names.stream().forEach(x->System.out.println(x.toUpperCase()));
       //System.out.println(uppername);


        //--------------------------------------------------------------------------

      System.out.print("3. Find the first element in a list that starts with a specific letter.");

        List<String> nameStartWithA =  names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
        System.out.println(nameStartWithA);
        names.stream().filter(name -> name.startsWith("A")).forEach(x -> System.out.println(x));


   // ------------------------------------------------------------------------------------

        System.out.println("Count the number of elements in a list greater than a given value.");

         Long count = numbers.stream().filter(x->x>5).count();
        System.out.println(numbers.stream().filter(x->x>5).count());

        //------------------------------------------------------

        System.out.println("Sort a list of integers using streams.");
        numbers.stream().sorted().forEach(System.out::print);

        //---------------------------------------------------------

        System.out.println("Find the maximum and minimum values in a list using streams.");
        int a = numbers.stream().max((x,b) -> x - b).orElse(0);
        System.out.println(a);
        int b = numbers.stream().min((x,y) -> x - y).orElse(0);
        System.out.println(b);

        Optional<Integer> max = numbers.stream().max(Integer :: compareTo);
        Optional<Integer> min = numbers.stream().min(Integer :: compareTo);
        System.out.println("Max value ="+max+ " Min Value = "+  min);















    }


}
