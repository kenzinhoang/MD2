package bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter circle radius:");
        short r = new Scanner(System.in).nextShort();
        float pi = 3.14f;
        float result1 = 2 * pi * r;
        float result2 = pi * r * r;
        System.out.println("perimeter is:" + result1);
        System.out.println("acreage is:" + result2);
    }
}
