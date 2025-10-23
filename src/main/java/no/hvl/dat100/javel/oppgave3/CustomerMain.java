package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // TODO

        Customer c = new Customer("Trym", "trymhansen@gmail.com", 12345678, PowerAgreementType.SPOTPRICE);
        System.out.println(c);

        Customer c1 = new Customer();
        c1.setName("Jonathan");
        c1.setEmail("Jonathan@gmail.com");
        c1.setCustomer_id(123456448);
        c1.setAgreement(PowerAgreementType.POWERSUPPORT);
        System.out.println(c1);
    }
}
