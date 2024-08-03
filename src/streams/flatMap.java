package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap
{
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(List.of(1,2,3));
        listOfLists.add(List.of(4,5,6));
        listOfLists.add(List.of(7,8,9));

        List<Integer>  flatMap = listOfLists.stream()
                .flatMap(List ::stream)
                .collect(Collectors.toList());
        System.out.println(flatMap);
    }
}
// flatten of lis of list to  a single list
// using stream() to convert list of lists into a stream and then applying flatmap() to the stream