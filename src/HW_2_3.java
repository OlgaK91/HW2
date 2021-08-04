public class HW_2_3 {
    public static void main(String[] agrs) {

        int number = 2;
        byte lastPower = 9;
        long powerNumber = 0;
        for (int i = 0; i <= lastPower; i++) {
            powerNumber += Math.pow(number, i);
        }
        System.out.println(powerNumber);
    }
}