import java.util.ArrayList;

public class Baitap3 {
    public static void main(String[] args) {
        ArrayList<Integer> numberlist = new ArrayList<>();
        Random_Number rn = new Random_Number();
        numberlist.add(rn.getRandomNum());
        numberlist.add(rn.getRandomNum());
        numberlist.add(rn.getRandomNum());
        System.out.println("danh sách mảng: " + numberlist);
        try {
            checkList(numberlist);
            System.out.println("Số lớn nhất trong mảng là: " + maxNum(numberlist));
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

    public static int maxNum(ArrayList<Integer> list) {
        int x = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > x) {
                x = list.get(i);
            }
        }
        return x;
    }
}
