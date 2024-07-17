//=================================bt1======================
//public class Main {
//    public static void main(String[] args) {
//        int[] value = new int[]{10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
//        System.out.println("Danh sach Array hien tai " + Arrays.toString(value));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so nguyen muon xoa trong List");
//
//        if (!sc.hasNextInt()) {
//            System.out.println("Vui long nhap mot so nguyen");
//            sc.next();
//            return;
//        }
//
//        int input = sc.nextInt();
//        if (input <= 0) {
//            System.out.println("Vui long nhap mot so nguyen duong");
//            return;
//        }
//
//        int index = -1;
//        for (int i = 0; i < value.length; i++) {
//            if (value[i] == input) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index == -1) {
//            System.out.println("Khong tim thay phan tu can xoa");
//            return;
//        }
//
//        int[] newValue = new int[value.length - 1];
//
//        for (int i = 0; i < index; i++) {
//            newValue[i] = value[i];
//        }
//        for (int i = index; i < newValue.length; i++) {
//            newValue[i] = value[i + 1];
//        }
//
//        System.out.println("Danh sach Array sau khi xoa " + Arrays.toString(newValue));
//    }
//}


//=================================bt2======================
//public class Main {
//    public static void main(String[] args) {
//        int[] value = new int[]{10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
//        System.out.println("Danh sach Array hien tai " + Arrays.toString(value));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so nguyen muon them vao List");
//
//
//        while (true) {
//            if (sc.hasNextInt()) {
//                int input = sc.nextInt();
//                System.out.println("Nhap vi tri trong List");
//                while (true) {
//                    if (sc.hasNextInt()) {
//                        int index = sc.nextInt();
//                        if (index <= -1 || index >= value.length - 1) {
//                            System.out.println("Không chèn được phần tử vào mảng.");
//                            break;
//                        } else {
//                            value = plus(value, input, index);
//                            System.out.println("Danh sach Array hien tai " + Arrays.toString(value));
//                            //break loop 2
//                            break;
//                        }
//                    } else {
//                        System.out.println("Vi tri nhap vao phai la mot so nguyen");
//                        sc.next();
//                    }
//                }
//                //break loop 1
//                break;
//
//            } else {
//                System.out.println("So nhap vao phai la mot so nguyen");
//                sc.next();
//            }
//
//        }
//
//    }
//
//    public static int[] plus(int[] list, int target, int position) {
//        int[] newValue = new int[list.length];
//        for (int i = 0; i < list.length; i++) {
//            if (i == position) {
//                newValue[i] = target;
//                continue;
//            }
//            newValue[i] = list[i];
//        }
//
//        return newValue;
//    }
//}

//================================= bt3 ======================
//public class Main {
//    public static void main(String[] args) {
//        int[] value1 = new int[]{2, 4, 6, 8, 10};
//        System.out.println("Danh sách một: " + Arrays.toString(value1));
//        int[] value2 = new int[]{1, 3, 5, 7, 9};
//        System.out.println("Danh sách hai: " + Arrays.toString(value2));
//        System.out.println("Tiến hành gộp hai mảng");
//        int[] value3 = new int[value1.length + value2.length];
//        for (int i = 0; i < value1.length; i++) {
//            value3[i] = value1[i];
//        }
//        for (int i = 0; i < value2.length; i++) {
//            value3[i + value1.length] = value2[i];
//        }
//        System.out.println("Danh sách ba: " + Arrays.toString(value3));
//
//
//    }
//}

//================================= bt4 ======================
//public class Main {
//    public static void main(String[] args) {
//        int[][] matrix = new int[3][3];
//        System.out.println("Nhập số cho ma trận theo hướng từ trái sang phải từ trên xuống dưới");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Nhập số ở hàng số: " + i + " cột: " + j);
//                while (true) {
//                    if (sc.hasNextInt()) {
//                        matrix[i][j] = sc.nextInt();
//                        break;
//                    } else {
//                        System.out.println("Vui lòng nhập vào số nguyên");
//                        sc.next();
//                    }
//                }
//            }
//        }
//
//        //In ra ma trận
//        System.out.println("Ma trận");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        //In giá trị lớn nhất
//        int maxValue = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (matrix[i][j] > maxValue) {
//                    maxValue = matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Giá trị lớn nhất là: " + maxValue);
//
//
//    }
//}


//================================BT5===========================
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {10, -5, 4, 8, 3, 20, 7, 9, -2, 6};
//        System.out.println("Mảng số nguyên: " + Arrays.toString(arr));
//        int minNumber = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (minNumber == 0) {
//                minNumber = arr[i];
//            } else {
//                for (int j = 0; j < arr.length; j++) {
//                    if (minNumber < arr[j]) {
//                        continue;
//                    } else {
//                        minNumber = arr[j];
//
//                    }
//                }
//            }
//
//        }
//        System.out.println("Giá trị nhỏ nhất: " + minNumber);
//    }
//}


//================================BT6===========================
//public class Main {
//    public static void main(String[] args) {
//        String word1 = "Hello";
//        System.out.println(word1.concat(" World"));
//    }
//}
//

//=================================BT7===========================
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        String word = "Hello World";
//        System.out.println(word);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập ký tự cần kiểm tra");
//        String check = sc.nextLine();
//        if (word.contains(check) && !check.equals(" ")) {
//            System.out.println("Có chứa ký tự " + check);
//        } else {
//            System.out.println("Không chứa ký tự " + check);
//        }
//    }
//}
//

//=================================BT8===========================
//public class Main {
//    public static void main(String[] args) {
//        String word = " Hello World ";
//        System.out.println(word.trim());
//    }
//}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//=================================BT9===========================
public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập email của bạn");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String email = sc.nextLine();
            if (validate(email)) {
                System.out.println("Email hợp lệ " + email);
                System.out.println("Nhập pw của bạn");
                while (true) {
                    String pw = sc.nextLine();
                    if (validatePw(pw)) {
                        System.out.println("Pw hợp lệ " + pw);
                        break;
                    } else {
                        System.out.println("Vui lòng nhập lại");
                    }

                }
                break;

            } else {
                System.out.println("Vui lòng nhập lại");
            }


        }

    }


    //validate Email
    public static final Pattern Validate_Email =
            Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

    public static boolean validate(String emailStr) {
        Matcher matcher = Validate_Email.matcher(emailStr);
        return matcher.matches();
    }


    //Validate Password
    /*Note for PW
    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,20}$");
  ^: indicates the string’s beginning
  (?=.*[a-z]): makes sure that there is at least one small letter
  (?=.*[A-Z]): needs at least one capital letter
  (?=.*\\d): requires at least one digit
  (?=.*[@#$%^&+=]): provides a guarantee of at least one special symbol
  .{8,20}: imposes the minimum length of 8 characters and the maximum length of 20 characters
   $: terminates the string
    */
    public static final Pattern Validate_Pw =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{6,20}$");

    public static boolean validatePw(String pwStr) {
        Matcher matcher = Validate_Pw.matcher(pwStr);
        return matcher.matches();
    }
}

//================================BT10================

