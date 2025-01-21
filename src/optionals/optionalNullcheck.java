package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class optionalNullcheck
{
    public static void main(String[] args) {
        String[] words =  new String[10];
        Optional<String>  checknull =  Optional.ofNullable(words[0]);
        if(checknull.isPresent()){
            String wor =  words[0].toLowerCase();
            System.out.println(wor);
        }
        else
            System.out.println("word is null");
    }
}
