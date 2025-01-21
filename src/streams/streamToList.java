package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamToList
{
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        List<String>  list= stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
