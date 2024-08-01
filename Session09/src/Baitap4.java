import java.util.Arrays;
import java.util.List;

public class Baitap4 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("banana", "melon", "orange", "apple");
        str.stream().sorted()
                .forEach(string -> System.out.print(string + " "));
    }
}
