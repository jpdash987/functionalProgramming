import java.util.List;
import java.util.stream.IntStream;

public class dropWhileExample {

    public static void main(String[] args) {


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        IntStream stream = list.stream().mapToInt(i -> i);

        stream.dropWhile(i -> i < 5)
                .forEach(System.out::println);
    }
}