import java.util.Arrays;
import java.util.List;

public class Baitap5 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("banana", "melon", "orange", "apple");
        str.stream().forEach(System.out::println);
    }
}
