public class Calculator {

    private final static double CONVERSION_FACTOR = 1024;

    public static String toHumanReadable(double bytes) {

        if (bytes < CONVERSION_FACTOR) return bytes + " B";

        int power = 0;
        String prefix = "BkMGTPE";

        while (bytes > CONVERSION_FACTOR) {
            power++;
            bytes /= CONVERSION_FACTOR;
        }

        return String.format("%.2f %cB", bytes, prefix.charAt(power));

    }
}
