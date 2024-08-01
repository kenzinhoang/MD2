import java.util.Arrays;
import java.util.List;

public class Baitap1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 30, 16, 7, 8, 9, 10);
        Integer max = numbers.stream().max(Integer::compare).get();
        System.out.println("The maximum value is : " + max);
    }
}
