package be.intecbrussel.customers;

public class CustomerFactory {

    private static final String[] NAMES = {"Manu", "Dieter", "Axel", "Anthony", "Elline", "Manon", "Audric", "Kevin", "Matteo"};

    public static AbstractCustomer getCustomer(String name) {

        for (String customer : NAMES) {
            if (customer.equals(name)) {
                return new RealCustomer(customer);
            }
        }
        return new NullCustomer();
    }
}
