public class HW_2_5 {
    public static void main(String[] agrs) {

        int startN = 1;
        int endN = 30;
        double val = 2.54;
        String str;
        for (int i = startN; i <= endN; i++) {
            if (i % 10 == 1 && !(i >= 11 && i <= 20)) {
                str = " дюйм ";
            } else if (i % 10 >= 2 && i % 10 <= 4 && !(i >= 11 && i <= 20)) {
                str = " дюйма ";
            } else {
                str = " дюймов ";
            }
            System.out.println(i + str + "= " + i * val + " см");
        }

    }
}