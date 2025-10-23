package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        Customer c = new Customer("Ola pettersen", "pettersen@gmail.com", 1234, PowerAgreementType.POWERSUPPORT);
        Customer c1 = new Customer("Ola pettersen", "pettersen@gmail.com", 1234, PowerAgreementType.POWERSUPPORT);
        Customer c2 = new Customer("Ola pettersen", "pettersen@gmail.com", 1234, PowerAgreementType.POWERSUPPORT);


        System.out.println(c);
        System.out.println("Month: " + Invoice.month);
        System.out.printf("Usage: %.2f kWh \n", totalUsage);
        System.out.printf("Amount: %.2f NOK \n", amount);
    }

    }
}
