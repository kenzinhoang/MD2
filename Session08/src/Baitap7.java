public class Baitap7 {
    public static void main(String[] args) {
        String myList = "21abc";
        int numberList = 0;
        String a = "";
        try {
            for (int i = 0; i < myList.length(); i++) {
                System.out.println(myList.charAt(i));
//                a = String.valueOf(myList.charAt(i));
//
//                System.out.println(a + "check a");
                //numberList += Integer.valueOf(myList.charAt(i));

            }
        } catch (NumberFormatException e) {
            // numberList = numberList.charAt(i)
            System.out.println(e.getMessage());
        }

    }
}
