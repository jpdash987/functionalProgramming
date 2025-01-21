package program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prefixSuffix
{
    public static void main(String[] args) {
        List<String> LIST = Arrays.asList("fb","twitter","instagram");

        String joined =  LIST.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(joined);

    }
}
