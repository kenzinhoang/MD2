public class Baitap7 {
    public static void main(String[] args) {
        String myList = "21abc";
        String resultStr = convert(myList);
        System.out.println("str trước khi đổi: " + myList);
        System.out.println("str sau khi đổi: " + resultStr);
    }

    public static String convert(String input) {
        StringBuilder sb = new StringBuilder();

        for (char i : input.toCharArray()) {
            try {
                if (Character.isDigit(i)) {
                    sb.append(i);

                } else {
                    throw new NumberFormatException("Ký tự không hợp lệ: " + i);
                }
            } catch (NumberFormatException e) {
                sb.append('0');
            }
        }

        return sb.toString();
    }


}
