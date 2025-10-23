package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers c = new Customers(4);

        //c)
        //System.out.println(c.getCustomer(1234));

        //d)
        //c.addCustomer(new Customer("Jamal", "jamaldemarcusthethird@gmail.com", 123456, PowerAgreementType.NORGESPRICE));
        //c.addCustomer(new Customer("Emil", "Emil@gmail.com", 1346, PowerAgreementType.NORGESPRICE));
        c.addCustomer(new Customer("Lingling", "kungpao123@gmail.com", 3456, PowerAgreementType.POWERSUPPORT));
        //c.addCustomer(new Customer("YingYang", "Chingching3@gmail.com", 123, PowerAgreementType.SPOTPRICE));
        //System.out.println(c.addCustomer(new Customer("Emil", "Emil123@gmail.com", 123456, PowerAgreementType.NORGESPRICE)));

        //e)
        System.out.println(c.removeCustomer(123));

        //f)
        c.addCustomer(new Customer("Jamal", "jamal@hotmail.com", 123, PowerAgreementType.NORGESPRICE ));
        c.addCustomer(new Customer("linglang", "linglang@hotmail.com", 1234, PowerAgreementType.NORGESPRICE ));
        Customer[] nye = c.getCustomers();

        for (Customer c1 : nye) {
            System.out.println(c1);
        }
    }
}
