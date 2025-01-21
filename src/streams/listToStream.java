package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class listToStream
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
