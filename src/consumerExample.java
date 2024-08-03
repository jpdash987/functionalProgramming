import java.util.function.Consumer;

public class consumerExample
{
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");
    }
}
// TAKE ARGUMENT <T>  RETURN NO RESULT