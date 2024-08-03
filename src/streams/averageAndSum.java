package streams;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class averageAndSum
{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double average = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
        System.out.println(average);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
