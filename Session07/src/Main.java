////generic
//public class Main {
//    public static void main(String[] args) {
//        Demo1<String, Integer> demo1 = new Demo1<>();
//        demo1.setData1("day");
//        demo1.setData2(20);
//        System.out.println(demo1.getData1() + " " + demo1.getData2());
//
//        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        demo1.newGen(numbers);
//    }
//}

//Java Collection
//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student("Nam", 20, true);
//        Student student1 = new Student("Hoa", 22, false);
//        Student student2 = new Student("Ha", 25, false);
//        Student student3 = new Student("Vu", 23, true);
//        Student student4 = new Student("Ngoc", 27, false);
//        List<Student> studentsList = new ArrayList<Student>();
//        studentsList.add(student);
//        studentsList.add(student1);
//        studentsList.add(student2);
//        studentsList.add(student3);
//        studentsList.add(student4);
//        System.out.println("Danh sách học sinh:");
//        System.out.println(studentsList);
//        System.out.println("==============================");
//
//        //in ra sex = false
//        System.out.println("Danh sách học sinh có giới tính false:");
//        for (int i = 0; i < studentsList.size(); i++) {
//            if (studentsList.get(i).getGender() == false) {
//                System.out.println(studentsList.get(i));
//            }
//
//        }
//        System.out.println("==============================");
//
//        //in ra student lớn tuổi nhất
//        Student studentMax = studentsList.get(0);
//        for (int i = 1; i < studentsList.size(); i++) {
//            if (studentsList.get(i).getAge() > studentMax.getAge()) {
//                studentMax = studentsList.get(i);
//            }
//        }
//        System.out.println("Học sinh lớn tuổi nhất :" + studentMax);
//    }
//
//
//}


import java.util.ArrayList;
import java.util.Random;
//bai tap 1
//public class Main {
//    public static void main(String[] args) {
//        Random rand = new Random();
//        ArrayList<Integer> numberlist = new ArrayList<>(10);
//        for (int i = 0; i < 10; i++) {
//            numberlist.add(rand.nextInt(100) + 1);
//        }
//
//        System.out.println("dsach so nguyen " + numberlist);
//        System.out.println("Gia tri lon nhat la: "
//                + Collections.max(numberlist));
//
//    }
//}
//=====================================================
//bai tap2
//public class Main {
//    public static void main(String[] args) {
//        List<String> strList = new ArrayList<String>(5);
//        strList.add("Anh");
//        strList.add("Han");
//        strList.add("Nam");
//        strList.add("Phuc");
//        strList.add("Ha");
//        for (String str : strList) {
//            if (str.length() > 3) {
//                System.out.println(str);
//            }
//
//        }
//
//    }
//}


//===================================================
//bai tap 3
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numberlist = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            numberlist.add(rand.nextInt(10) + 1);
        }
        System.out.println("dsach so nguyen " + numberlist);
        final int[] sum = {0};
        numberlist.forEach(number -> sum[0] += number);
        System.out.println("Tong la " + sum[0]);
    }
}

//==================================================
//bai tap 4


