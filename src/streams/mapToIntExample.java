package streams;

import java.util.List;
import java.util.stream.Collectors;

public class mapToIntExample
{
    public static void main(String[] args) {
        List<String>  words = List.of("apple","jp" ,"applyyyy");


        List<Integer> length =  words.stream()
                                     .mapToInt(String::length)
                                     .boxed()
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
// used to process sequence of elements in a functional style