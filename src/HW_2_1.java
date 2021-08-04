public class HW_2_1 {
    public static void main(String[] agrs) {

        int daysNumber = 3;
        double kmPerDay = 10;
        double increaceP = 0.1;

        double totalDistance = 0;
        for (double i = 1; i <= daysNumber; i++) {
            kmPerDay *= (increaceP * (i - 1) + 1);
            totalDistance += kmPerDay;
        }
        System.out.println(totalDistance);
    }
}
