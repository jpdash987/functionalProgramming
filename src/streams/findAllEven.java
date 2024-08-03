package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findAllEven
{
    public static void main(String[] args) {
        List<Integer> evenNumbers = IntStream.rangeClosed(0,100)
                .filter( n ->n%2 == 0)
                .boxed() // it converts intstream to stream<Integer>
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
