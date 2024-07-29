import java.util.ArrayList;
import java.util.List;

public class Baitap6 {
    public static void main(String[] args) {
        List<String> numberlist = new ArrayList<>();
        numberlist.add("30");
        numberlist.add("15");
        numberlist.add("abc");
        numberlist.add("5");
        System.out.println("danh sách mảng: " + numberlist);
        int sum = 0;
        for (String i : numberlist) {
            try {
                int x = Integer.parseInt(i);
                sum += x;
            } catch (NumberFormatException e) {
                System.out.println("lỗi: " + i + " không phải là số nguyên");
            }
        }

        System.out.println("Tổng mảng là: " + sum);
    }

    public static void checkList(List<String> list) {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Lỗi: Mảng rỗng");
        } else if (list.size() > 0) {
            System.out.println("Mảng hợp lệ");
        }
    }


}
