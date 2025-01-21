package program;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findmInmax
{
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4,4);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

    }
}
