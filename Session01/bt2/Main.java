package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter USD:");
        int a = new Scanner(System.in).nextInt();
        Short dollar = 25000;
        System.out.println(a * dollar + " VND");
    }
}
