import java.util.Arrays;
import java.util.List;

public class Baitap2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println("Số chẵn là: " + num));


    }
}
