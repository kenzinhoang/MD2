import java.util.Calendar;
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập ngày:");
            int day = sc.nextInt();
            System.out.println("Nhập tháng:");
            int month = sc.nextInt();
            System.out.println("Nhập năm:");
            int year = sc.nextInt();
            validate(day, month, year);
            System.out.println("Thời gian hợp lệ:" + day + "/" + month + "/" + year);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Ngày không hợp lệ: " + day);
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Tháng không hợp lệ: " + month);
        }
        if (year < 1000 || year > 9999) {
            throw new IllegalArgumentException("Năm không hợp lệ: " + year);
        }
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        //tính nghiêm ngặt của lịch
        // vd(true) để ngày 32 tự động chuyển thành ngày 1 tháng sau
        cal.set(year, month - 1, day);
        try {
            cal.getTime();
        } catch (Exception e) {
            throw new IllegalArgumentException("Thời gian không hợp lệ:" + day + "/" + month + "/" + year);
        }
    }

}
