public class HW_2_7 {
    public static void main(String[] args) {
        byte startN = 1;
        byte endN = 99;
        long summ = 0;
        for (int i = startN; i <= endN; i++) {
            if (i % 2 != 0) {
                summ += i;
            }
        }
        System.out.println(summ);
    }
}