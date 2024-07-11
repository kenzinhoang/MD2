import java.util.Scanner;


//===========BAI TAP 1===========================
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("nhap vao 1 so nguyen bat ky");
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            if (scanner.hasNextInt()) {
//
//                int a = scanner.nextInt();
//                if (a % 3 == 0 || a % 5 == 0) {
//                    if (a % 3 == 0 && a % 5 == 0) {
//                        System.out.println(a + "Chia het cho ca 3 va 5");
//                        break;
//                    }
//                    if (a % 3 == 0) {
//                        System.out.println(a + "Chia het cho 3");
//                        break;
//                    }
//                    if (a % 5 == 0) {
//                        System.out.println(a + "Chia het cho 5");
//                        break;
//                    }
//                } else {
//                    System.out.println(a + "Khong chia het cho ca 3 va 5");
//                    break;
//                }
//            } else {
//                System.out.println("So ban nhap khong phai la so nguyen");
//                System.out.println("nhap vao 1 so nguyen bat ky");
//                scanner.next();
//            }
//        }
//
//    }
//}


//=====================================BAI TAP 2=======================================
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("nhap vao 1 so nguyen bat ky");
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                if (0 <= number && number <= 9) {
//                    switch (number) {
//                        case 0:
//                            System.out.println("So Khong");
//                            break;
//                        case 1:
//                            System.out.println("So Mot");
//                            break;
//                        case 2:
//                            System.out.println("So Hai");
//                            break;
//                        case 3:
//                            System.out.println("So Ba");
//                            break;
//                        case 4:
//                            System.out.println("So Bon");
//                            break;
//                        case 5:
//                            System.out.println("So Nam");
//                            break;
//                        case 6:
//                            System.out.println("So Sau");
//                            break;
//                        case 7:
//                            System.out.println("So Bay");
//                            break;
//                        case 8:
//                            System.out.println("So Tam");
//                            break;
//                        case 9:
//                            System.out.println("So Chin");
//                            break;
//                    }
//                    break;
//                } else {
//                    System.out.println("So nhap vao khong phu hop");
//                    System.out.println("Nhap 1 so nguyen bat ky");
//                    scanner.next();
//                }
//            } else {
//                System.out.println("So nhap vao khong phu hop");
//                System.out.println("Nhap 1 so nguyen bat ky");
//                scanner.next();
//            }
//
//        }
//
//
//    }
//}


//================================BAI TAP 3========================================
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println(i + "Chia het cho ca 3 va 5");
//                    continue;
//                }
//                if (i % 3 == 0) {
//                    System.out.println(i + "Chia het cho 3");
//                    continue;
//                }
//                if (i % 5 == 0) {
//                    System.out.println(i + "Chia het cho 5");
//                }
//            }
//
//        }
//    }
//}


//================================BAI TAP 4=========================================
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("nhap vao so tu nhien dau tien");
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int firstNumber = scanner.nextInt();
//                System.out.println("So thu 1: " + firstNumber);
//                System.out.println("nhap vao so tu nhien thu hai");
//                while (true) {
//                    if (scanner.hasNextInt()) {
//                        int secondNumber = scanner.nextInt();
//                        System.out.println("So thu 2: " + secondNumber);
//                        for (int i = firstNumber; i <= secondNumber; i++) {
//                            if (i % 2 == 0) {
//                                sum += i;
//                            }
//                        }
//                        System.out.println(sum + " la tong so chan");
//                        break;
//                    } else {
//                        System.out.println("So nhap vao khong phu hop");
//                        System.out.println("nhap vao so tu nhien thu hai");
//                        scanner.next();
//                    }
//                }
//            } else {
//                System.out.println("So nhap vao khong phu hop");
//                System.out.println("nhap vao so tu nhien dau tien");
//                scanner.next();
//            }
//
//        }
//
//    }
//}


//================================BAI TAP 5========================================
//public class Main {
//    public static void main(String[] args) {
//
//        for (int i = 2; i <= 100; i++) {
//            Boolean isPrime = true;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(i + " la so nguyen to");
//            }
//        }
//    }
//}


//================================BAI TAP 6========================================
//public class Main {
//    public static void main(String[] args) {
//        int maxResult = 0;
//        for (int i = 2; i <= 100; i++) {
//            Boolean isPrime = true;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                if (maxResult >= 20) {
//                    break;
//                } else {
//                    maxResult += 1;
//                    System.out.println(i + " la so nguyen to thu: " + maxResult);
//                }
//            }
//        }
//    }
//}


//================================BAI TAP 7========================================
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
//            System.out.println("2. Kiểm tra số nguyên tố");
//            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
//            System.out.println("4. Thoát");
//            System.out.print("Chọn một chức năng: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    checkEven(scanner);
//                    break;
//                case 2:
//                    checkPrime(scanner);
//                    break;
//                case 3:
//                    check3(scanner);
//                    break;
//                case 4:
//                    System.out.println("Thoát chương trình.");
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//                    break;
//            }
//        } while (choice != 4);
//        scanner.close();
//    }
//
//    // check chan le
//    public static void checkEven(Scanner scanner) {
//        System.out.print("nhap mot so: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println(number + " la so chan");
//        } else {
//            System.out.println(number + " la so le");
//        }
//    }
//
//    // check so nguyen to
//    public static void checkPrime(Scanner scanner) {
//        System.out.print("Nhập một số: ");
//        int number = scanner.nextInt();
//        if (number <= 1) {
//            System.out.println(number + " khong phai la so nguyen to");
//        } else {
//            Boolean isPrime = true;
//            for (int i = 2; i <= number / 2; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(number + "  la so nguyen to");
//            } else {
//                System.out.println(number + " khong phai la so nguyen to");
//            }
//        }
//    }
//
//    //check chia het cho 3
//    public static void check3(Scanner scanner) {
//        System.out.print("nhap mot so: ");
//        int number = scanner.nextInt();
//        if (number % 3 == 0) {
//            System.out.println(number + " chia het cho 3");
//        } else {
//            System.out.println(number + " khong chia het cho 3");
//        }
//    }
//
//}

//================================BAI TAP 8========================================
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        while (true) {
            System.out.println("Nhập vào cạnh A của tam giác:");
            a = validateInput(scanner);

            System.out.println("Nhập vào cạnh B của tam giác:");
            b = validateInput(scanner);

            System.out.println("Nhập vào cạnh C của tam giác:");
            c = validateInput(scanner);

            if (isValidTriangle(a, b, c)) {
                break;
            } else {
                System.out.println("Các cạnh nhập vào không tạo thành một tam giác hợp lệ. Vui lòng nhập lại.");
            }
        }

        int choice;
        do {
            System.out.println("1. Tính chu vi");
            System.out.println("2. Tính diện tích");
            System.out.print("Chọn một chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    float p = chuVi(a, b, c);
                    System.out.println("Chu vi tam giác: " + p);
                    break;
                case 2:
                    float s = dientich(a, b, c);
                    System.out.println("Diện tích tam giác: " + s);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 1 && choice != 2);

        scanner.close();
    }

    public static int validateInput(Scanner scanner) {
        int check;
        while (true) {
            if (scanner.hasNextInt()) {
                check = scanner.nextInt();
                if (check > 0) {
                    break;
                } else {
                    System.out.println("Giá trị nhập vào phải lớn hơn 0. Vui lòng nhập lại:");
                }
            } else {
                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập lại:");
                scanner.next();
            }
        }
        return check;
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Tính chu vi
    public static float chuVi(int a, int b, int c) {
        return a + b + c;
    }

    // Tính diện tích
    public static float dientich(int a, int b, int c) {
        float p = (float) (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}