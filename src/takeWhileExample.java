import java.util.List;
import java.util.stream.IntStream;

public class takeWhileExample
{
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);



        IntStream  stream = list.stream().mapToInt(i ->i);

        stream.takeWhile(i ->i<6)
                .forEach(System.out::println);
    }
}
// short circuit terminal operation  that is used to return a stream of the elements
//  from the original stream that satisfy a given predicate