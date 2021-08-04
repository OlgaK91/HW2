public class HW_2_4 {
    public static void main(String[] agrs) {

        int a = 11;
        int b = 11;
        long result = a;
        for (int i = 1; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}