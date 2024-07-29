import java.util.ArrayList;
import java.util.Collections;

public class Baitap5 {
    public static void main(String[] args) {
        ArrayList<Integer> numberlist = new ArrayList<>();
        Random_Number rn = new Random_Number();
        numberlist.add(rn.getRandomNum());
        numberlist.add(rn.getRandomNum());
        numberlist.add(rn.getRandomNum());
        System.out.println("danh sách mảng: " + numberlist);
        Collections.reverse(numberlist);
        System.out.println("danh sách mảng đã đảo nguược: " + numberlist);
        try {
            checkList(numberlist);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void checkList(ArrayList<Integer> list) {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Lỗi: Mảng rỗng");
        } else if (list.size() > 0) {
            System.out.println("Mảng hợp lệ");
        }
    }

}
