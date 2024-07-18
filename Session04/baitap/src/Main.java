import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }


    public class Employee {
        private int id;
        private String name;
        private int age;
        private boolean gender;
        private double salary;

        public Employee(int id, String name, int age, boolean gender, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        //input data
        public void inputData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap id nhan vien: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nhap ten nhan vien: ");
            name = sc.nextLine();
            sc.nextLine();

            System.out.println("Nhap tuoi nhan vien: ");
            age = sc.nextInt();
            sc.nextLine();
        }
    }

}

