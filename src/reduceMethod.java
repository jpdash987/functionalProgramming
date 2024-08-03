import java.util.Arrays;

public class reduceMethod
{
    public static void main(String[] args) {

        int[]  numbers  = {1,3,4,5};
   //     int sum = Arrays.stream(numbers).sum();
        int sum = Arrays.stream(numbers).reduce(0, (a,b) -> a+b);

        System.out.println(sum);


    }
}
 // reduction of the element on the stream
 // terminal opearation
 //