public class HW_2_6 {
    public static void main(String[] args) {
        byte startN = 2;
        byte endN = 100;
        String str = "";
        for (int i = startN; i <= endN; i++) {
            if (i % 2 == 0) {
                str += i + " ";
            }
        }
        System.out.println(str);
    }
}
