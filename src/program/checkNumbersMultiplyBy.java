package program;

import java.util.Arrays;
import java.util.List;

public class checkNumbersMultiplyBy
{
    public static void main(String[] args) {


        List<Integer> listofInteges = Arrays.asList(1, 25, 45, 23);
     listofInteges.stream()
             .filter(i->i%5==0)
             .forEach(System.out::println);
    }
}
