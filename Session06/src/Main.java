//bt1-bt2
//public class Main {
//    public static void main(String[] args) {
////Kiểm thử Class Shape
//        System.out.println("-------- - SHAPE----------");
//
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//
//
////kiểm thử Class Circle
//        System.out.println("-------- - CIRCLE----------");
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//        circle.resize(150); // 5.25
//        System.out.println(circle);
//
////        System.out.println("Giai phan 2");
//
////Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//        rectangle.resize(10);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
////Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//
//        Square square = new Square();
//        square.resize(30);
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
//
//
//        System.out.println("Bai Mau");
//        Scanner sc = new Scanner(System.in);
//        Shape[] shapes = new Shape[3];
//
//        for (int i = 0; i < shapes.length; i++) {
//            System.out.println("1/ Circle, 2/ Rectangle, 3/ Square");
//            System.out.println("Ban muon tao hinh nao ");
//            while (true) {
//                if (sc.hasNextInt()) {
//                    int choice = sc.nextInt();
//                    switch (choice) {
//                        case 1:
//                            System.out.println("Nhap ban kinh");
//                            double radius = sc.nextDouble();
//                            shapes[i] = new Circle(radius);
//                            break;
//                        case 2:
//                            System.out.println("Nhap chieu dai");
//                            double width = sc.nextDouble();
//                            System.out.println("Nhap chieu rong");
//                            double height = sc.nextDouble();
//                            shapes[i] = new Rectangle(width, height);
//                            break;
//                        case 3:
//                            System.out.println("Nhap canh");
//                            double side = sc.nextDouble();
//                            shapes[i] = new Square(side);
//                            break;
//                        default:
//                            shapes[i] = new Circle(1);
//                            break;
//                    }
//                    break;
//                } else {
//                    System.out.println("Ban phai nhap so");
//                    sc.nextLine();
//                }
//            }
//        }
//
//
//        System.out.println("danh sach hinh cua ban " + Arrays.toString(shapes));
//
//
//        for (int i = 0; i < shapes.length; i++) {
//            shapes[i].resize(randomOneTo100());
//        }
//
//        System.out.println("danh sach hinh cua ban sau khi resize random " + Arrays.toString(shapes));
//
//    }
//
//
//    public static int randomOneTo100() {
//        double rNumber = Math.random();
//        double d = rNumber * 100;
//
//        //Type cast double to int
//        int randomInt = (int) d;
////
//        return randomInt;
//    }
//
//
//}

import bt3.AudioPlayer;
import bt3.VideoPlayer;

//bt3
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();

    }
}