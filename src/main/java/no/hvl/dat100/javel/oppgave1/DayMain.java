package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        // TODO
        //a)
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        //b)
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        //c)
        System.out.println(DailyPower.computePowerUsage(powerusage_day));
        System.out.println();

        // d)
        System.out.println(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println();

        //e)
        System.out.println(DailyPower.getSupport(2.19, 2.0));
        System.out.println();

        //f)
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println();

        //g)
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println();

        //h)
        System.out.println(DailyPower.findPeakUsage(powerusage_day));
        System.out.println();

        //i)
        System.out.println(DailyPower.findAvgPower(powerusage_day));
    }
}
