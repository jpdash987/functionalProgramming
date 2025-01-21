package program;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mergeTwoUnsorted
{
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5};
        int[] b = new int[]{1,3,4,5};

        int[] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
