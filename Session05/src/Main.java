import baitap4.ArrayCalculator;

import static baitap4.ArrayCalculator.sumOfArray;

public class Main {
    //baitap1
//    public static void main(String[] args) {
//        Circle circle = new Circle(2, "green");
//        System.out.println(circle.toString());
//
//        Cylinder cylinder = new Cylinder(3, "red", 5);
//        System.out.println(cylinder.toString());
//
//    }

    //baitap2
//    public static void main(String[] args) {
//        Point2D point2D = new Point2D(10, 10);
//        System.out.println(point2D.toString());
//
//        Point3D point3D = new Point3D(10, 5, 5);
//        System.out.println(point3D.toString());
//
//    }

    //baitap3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào màu:");
//        String color = sc.nextLine();
//        System.out.println("Nhập vào cạnh đầu tiên:");
//        while (true) {
//            if (sc.hasNextDouble()) {
//                double side1 = sc.nextDouble();
//                System.out.println("Nhập vào cạnh thứ hai:");
//                while (true) {
//                    if (sc.hasNextDouble()) {
//                        double side2 = sc.nextDouble();
//                        System.out.println("Nhập vào cạnh thứ ba:");
//                        while (true) {
//                            if (sc.hasNextDouble()) {
//                                double side3 = sc.nextDouble();
//                                Triagle triagle = new Triagle(side1, side2, side3, color);
//                                System.out.println(triagle.toString());
//                                break;
//                            } else {
//                                System.out.println("Vui lòng nhập lại");
//                                sc.next();
//                            }
//                        }
//                        break;
//                    } else {
//                        System.out.println("Vui lòng nhập lại");
//                        sc.next();
//                    }
//                }
//                break;
//            } else {
//                System.out.println("Vui lòng nhập lại");
//                sc.next();
//            }
//        }
//
//
//    }

    //baitap4
    public static void main(String[] args) {
        ArrayCalculator calculator = new ArrayCalculator();
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] doubleArray = {1.5, 2.5, 3.0, 4, 0.5, 6, 7.5, 8, 9, 10};
        System.out.println("Tổng mảng số nguyên là: " + sumOfArray(intArray));
        System.out.println("Tổng mảng số thực là: " + sumOfArray(doubleArray));
    }
}