package bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap chieu dai canh hinh vuong:");
        short a = new Scanner(System.in).nextShort();
        short b = 4;
        System.out.println("Chu vi hinh vuong:" + a * b);
        System.out.println("Dien tich hinh vuong:" + a * a);
    }
}
