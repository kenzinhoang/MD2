import java.util.Scanner;

public class Baitap1 {
    ////bai tap 1
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Nhập số bị chia: ");
                int a = sc.nextInt();
                System.out.println("Nhập số chia: ");
                int b = sc.nextInt();
                int result = a / b;
                System.out.println("Kết quả là: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Không thể chia cho 0");
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên");

            }

        }
    }


}
