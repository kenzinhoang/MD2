import java.util.InputMismatchException;
import java.util.Scanner;

public class Baitap2 {
    //bai tap 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập vào một số nguyên thứ nhất:");
                int a = sc.nextInt();
                System.out.println("Nhập vào một số nguyên thứ hai:");
                int b = sc.nextInt();
                System.out.println("Tổng hai số nguyên là: " + sum(a, b));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập vào số nguyên");
                sc.next();
            }
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
