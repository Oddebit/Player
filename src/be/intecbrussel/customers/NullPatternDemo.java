package be.intecbrussel.customers;

public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 =
                CustomerFactory.getCustomer("Gokhan");
        AbstractCustomer customer2 =
                CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 =
                CustomerFactory.getCustomer("Manu");
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}

