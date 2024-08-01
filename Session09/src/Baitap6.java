import java.util.Arrays;
import java.util.List;

public class Baitap6 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("banana", "melon", "orange", "apple");
        str.stream().map(String::toUpperCase)
                .forEach(string -> System.out.print(string + " "));
    }
}
