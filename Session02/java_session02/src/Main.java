import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            if (scanner.hasNextInt()) {
//                System.out.println("nhap vao 1 so nguyen bat ky");
//                int a = scanner.nextInt();
//                if (a % 2 == 0) {
//                    System.out.println(a + "La so chan");
//                } else {
//                    System.out.println(a + "La so le");
//                    break;
//                }
//            } else {
//                System.out.println("So ban nhap khong phai la so nguyen");
//                scanner.next();
//            }
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("nhap vao gioi tinh cua ban");
//        Scanner scanner = new Scanner(System.in);
//        String gender = scanner.nextLine();
//
//        do {
//            if (gender.equals("nam")) {
//                System.out.println("gioi tinh cua ban la nam");
//                break;
//            } else if (gender.equals("nu")) {
//                System.out.println("gioi tinh cua ban la nu");
//                break;
//            }
//        } while (true);
//    }
//}


public class Main {
    public static void main(String[] args) {
        System.out.println("nhap vao 1 so nguyen bat ky");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (2 <= number && number <= 8) {
                    switch (number) {
                        case 2:
                            System.out.println("Thu 2");
                            break;
                        case 3:
                            System.out.println("Thu 3");
                            break;
                        case 4:
                            System.out.println("Thu 4");
                            break;
                        case 5:
                            System.out.println("Thu 5");
                            break;
                        case 6:
                            System.out.println("Thu 6");
                            break;
                        case 7:
                            System.out.println("Thu 7");
                            break;
                        case 8:
                            System.out.println("CN");
                            break;
                    }
                } else {
                    System.out.println("So nhap vao khong phu hop");
                    scanner.next();
                }
            } else {
                System.out.println("Nhap 1 so nguyen bat ky");
                scanner.next();
            }

        }


    }
}