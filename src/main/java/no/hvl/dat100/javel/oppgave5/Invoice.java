package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave5.CustomerPowerUsageData;
import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month
    private double totalUsage;


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {
        totalUsage = MonthlyPower.computePowerUsage(usage);
        if (PowerAgreementType.NORGESPRICE == c.getAgreement()) {
                    amount = MonthlyPower.computeNorgesPrice(usage);
        } else if(PowerAgreementType.POWERSUPPORT == c.getAgreement()) {
                    amount = MonthlyPower.computePowerSupport(usage, prices);
        } else {
                    amount = MonthlyPower.computeSpotPrice(usage, prices);
        }
    }

    public void printInvoice() {
        System.out.println(c);
        System.out.println("Month: " + month);
        System.out.printf("Usage: %.2f kWh \n", totalUsage);
        System.out.printf("Amount: %.2f NOK \n", amount);
    }

}
