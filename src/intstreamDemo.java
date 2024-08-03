import java.util.stream.IntStream;

public class intstreamDemo
{
    public static void main(String[] args) {

         int result = sumofEven(12);


    }

    private static int sumofEven(int p) {

        IntStream intStream = IntStream.range(0, p);

        int even = intStream.filter(i -> i % 2 == 0).sum();
        System.out.println(even);
        return even;
    }
}
//IntStream special type of stream in java specially designed for working for primitive int type
