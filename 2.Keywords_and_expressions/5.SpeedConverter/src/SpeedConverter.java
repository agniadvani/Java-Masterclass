public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(-24);
    }

    public static long toMilesPerHour(double kmph) {
        if (kmph < 0) {
            return -1;
        } else {
            return Math.round(kmph * 0.621371d);
        }
    }

    public static void printConversion(double kmph) {
        long mile = toMilesPerHour(kmph);
        if (mile == -1) {
            System.out.println("Invalid Number");
        } else {
            System.out.println(kmph + " km/h = " + mile + " m/h");
        }
    }
}
