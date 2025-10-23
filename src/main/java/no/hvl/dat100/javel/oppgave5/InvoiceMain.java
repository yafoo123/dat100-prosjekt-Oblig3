package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        // TODO

        //c)
        Customer c = new Customer("Ola pettersen", "pettersen@gmail.com", 1234, PowerAgreementType.POWERSUPPORT);
        Invoice invoice = new Invoice(c, "Januar", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        invoice.computeAmount();
        invoice.printInvoice();
    }
}
