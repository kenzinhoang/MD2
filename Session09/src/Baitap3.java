import java.util.Arrays;
import java.util.List;

public class Baitap3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Tổng là: " + sum);
    }
}
