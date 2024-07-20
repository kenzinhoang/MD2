
import java.util.Arrays;
import java.util.Scanner;


//===================Array======================
//public class Main {
//    public static void main(String[] args) {
//        String[] myArr = new String[2];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ho va ten dem cua ban");
//        String firstName = sc.nextLine();
//        System.out.println("Nhap ho va ten dem cua ban");
//        String lastName = sc.nextLine();
//        myArr[0] = firstName;
//        myArr[1] = lastName;
//        for (int i = 0; i < myArr.length; i++) {
//            System.out.print(myArr[i] + " ");
//        }
//
//    }
//}


//=================2D Array========================
//public class Main {
//    public static void main(String[] args) {
//        int[][] myArr = new int[3][2];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                System.out.println("nhap du lieu vao vi tri " + i + " " + j);
//                myArr[i][j] = sc.nextInt();
//            }
//
//        }
//        System.out.print("\n");
//        System.out.println("Gia tri trong array2D la:");
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                System.out.print(myArr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//
//    }
//}


//===================VD1======================
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArr = new int[3];
        numberArr[0] = 1;
        numberArr[1] = 2;
        numberArr[2] = 3;
        System.out.println("Danh sach hien co: " + Arrays.toString(numberArr));
        int choice;


        do {
            System.out.println("1.Them so nguyen vao List");
            System.out.println("2.Xoa so nguyen trong List");
            System.out.println("3.Thoat");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap so nguyen muon them vao List");
                    if (!sc.hasNextInt()) {
                        System.out.println("Vui long nhap mot so nguyen");
                        sc.next();
                    }
                    int input = sc.nextInt();
                    numberArr = plus(numberArr, input);
                    System.out.println("Danh sach hien tai: " + Arrays.toString(numberArr));
                    break;

                case 2:
                    System.out.println("Nhap so nguyen muon xoa trong List");
                    if (!sc.hasNextInt()) {
                        System.out.println("Vui long nhap mot so nguyen");
                        sc.next();
                    }
                    int target = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
                    break;
            }
        } while (choice != 3);
        sc.close();


    }

    public static int[] plus(int[] list, int target) {
        int[] newNumberArr = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newNumberArr[i] = list[i];
        }
        newNumberArr[newNumberArr.length - 1] = target;
        return newNumberArr;
    }

    public static void delete() {

    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int[] numberArr = new int[3];
//        numberArr[0] = 1;
//        numberArr[1] = 2;
//        numberArr[2] = 3;
//        System.out.println("Danh sach hien co: " + Arrays.toString(numberArr));
//
//        Scanner sc = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("Chon 1 tinh nang duoi day:");
//            System.out.println("1. Them so nguyen vao List");
//            System.out.println("2. Xoa so nguyen trong List");
//            System.out.println("3. Ket thuc chuong trinh");
//            while (!sc.hasNextInt()) {
//                System.out.println("Vui long nhap mot so nguyen!");
//                sc.next(); // Loại bỏ giá trị không hợp lệ
//            }
//            choice = sc.nextInt();
//            sc.nextLine();  // Consume newline left-over
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Nhap so nguyen muon them vao List");
//                    while (!sc.hasNextInt()) {
//                        System.out.println("Vui long nhap so nguyen!");
//                        sc.next(); // Loại bỏ giá trị không hợp lệ
//                    }
//                    int input = sc.nextInt();
//                    numberArr = plus(numberArr, input);
//                    System.out.println("Danh sach hien tai: " + Arrays.toString(numberArr));
//                    break;
//
//                case 2:
//                    System.out.println("Nhap so nguyen muon xoa trong List");
//                    while (!sc.hasNextInt()) {
//                        System.out.println("Vui long nhap so nguyen!");
//                        sc.next(); // Loại bỏ giá trị không hợp lệ
//                    }
//                    int target = sc.nextInt();
//                    numberArr = delete(numberArr, target);
//                    System.out.println("Danh sach hien tai: " + Arrays.toString(numberArr));
//                    break;
//
//                case 3:
//                    System.out.println("Ket thuc chuong trinh.");
//                    break;
//
//                default:
//                    System.out.println("Lua chon khong hop le, vui long chon lai.");
//                    break;
//            }
//        } while (choice != 3);
//
//        sc.close();
//    }
//
//    public static int[] plus(int[] list, int target) {
//        int[] newNumberArr = new int[list.length + 1];
//        for (int i = 0; i < list.length; i++) {
//            newNumberArr[i] = list[i];
//        }
//        newNumberArr[newNumberArr.length - 1] = target;
//        return newNumberArr;
//    }
//
//    public static int[] delete(int[] list, int target) {
//        boolean found = false;
//        int index = 0;
//        for (int i = 0; i < list.length; i++) {
//            if (list[i] == target) {
//                found = true;
//                index = i;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Khong tim thay so nguyen trong danh sach.");
//            return list;
//        }
//
//        int[] newNumberArr = new int[list.length - 1];
//        for (int i = 0, j = 0; i < list.length; i++) {
//            if (i != index) {
//                newNumberArr[j++] = list[i];
//            }
//        }
//        return newNumberArr;
//    }
//}
