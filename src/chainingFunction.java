import java.util.function.Function;

public class chainingFunction
{
    public static void main(String[] args) {
        Function<Integer , Integer> multiplyByTwo  =  number -> number  * 2 ;
        Function<Integer , Integer>  addThree =  number -> number + 3 ;
        Function<Integer , Integer>  addTwoAndMultiplyThree =  multiplyByTwo.andThen(addThree);


        int result =  addTwoAndMultiplyThree.apply(20);
        System.out.println(result);
    }
}
