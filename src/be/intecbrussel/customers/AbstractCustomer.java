package be.intecbrussel.customers;

public abstract class AbstractCustomer {

    protected String name;

    public boolean isNil() {
        return true;
    }

    public String getName() {
        return name;
    }
}
