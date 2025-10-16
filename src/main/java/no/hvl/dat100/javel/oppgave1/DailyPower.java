package no.hvl.dat100.javel.oppgave1;

public class DailyPower {
    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for(double i : prices){
            System.out.print(i + " nok ");
        }
        System.out.println();
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for(double i : usage){
            System.out.print(i + " kWh ");
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for (int i = 0; i < usage.length; i++){
            sum = usage[i] + sum;
        };

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        for(int i = 0; i < usage.length; i++) {
            price = price + usage[i] * prices[i];
            }
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    static double getSupport(double usage, double price) {

        double support = 0;
        if(price > THRESHOLD) {
            support = usage * (price - THRESHOLD) * PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        for(int i = 0; i < usage.length; i++) {
            if (prices[i] > THRESHOLD) {
                support += usage[i] * (prices[i] - THRESHOLD) * PERCENTAGE;
            }
        }
        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        for(int i = 0; i < usage.length; i++) {
            price += usage[i] * NORGESPRIS_KWH;
        }

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = usage[0];
        for (double i : usage) {
            if (i > temp_max) {
                temp_max = i;
            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
        for(int i = 0; i < usage.length; i++) {
            average += usage[i];
        }
        return average / usage.length;
    }
}