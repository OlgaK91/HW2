public class HW_2_2 {
    public static void main(String[] agrs) {

        byte hoursNumber = 24;
        byte divisionTime = 3;
        byte newPerHour = 2;
        int newPop;
        int totalPopulation = 1;
        for (int i = divisionTime; i <= hoursNumber; i += divisionTime) {
            newPop = totalPopulation * (newPerHour - 1);
            totalPopulation += newPop;
            System.out.println("всего амеб через " + i + " часа: " + totalPopulation);
        }

    }
}