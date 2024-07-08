package bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Math scores:");
        short a = new Scanner(System.in).nextShort();
        System.out.println("Enter Literature scores:");
        short b = new Scanner(System.in).nextShort();
        System.out.println("Enter English scores:");
        short c = new Scanner(System.in).nextShort();
        int result = (a + b + c) / 3;
        System.out.println("Average of subject is:" + result);
    }
}
