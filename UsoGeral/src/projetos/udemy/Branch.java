package projetos.udemy;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction){
        if (findCustomer(name) != null) return false;
        return customers.add(new Customer(name,initialTransaction));
    }

    public boolean addCustomerTransaction(String name, double transaction){
        if (findCustomer(name) == null) return false;

        findCustomer(name).addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getName().equals(name)) return customers.get(i);
        }

        return null;
    }
}
