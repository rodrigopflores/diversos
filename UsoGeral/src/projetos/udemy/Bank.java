package projetos.udemy;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) return false;

        Branch newBranch = new Branch(name);
        return branches.add(newBranch);
    }

    public boolean addCustomer(String branch, String nameCustomer, double initTransaction) {
        if (findBranch(branch) == null) return false;

        return findBranch(branch).newCustomer(nameCustomer, initTransaction);
    }

    public boolean addCustomerTransaction(String branch, String nameCustomer, double transaction) {
        if (findBranch(branch) == null) return false;

        return findBranch(branch).addCustomerTransaction(nameCustomer, transaction);

    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers(String branch, boolean print) {
        Branch tempBranch = findBranch(branch);
        if (tempBranch == null) return false;
        if (!print) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for (int i = 0; i < tempBranch.getCustomers().size(); i++) {
                Customer tempCustomer = tempBranch.getCustomers().get(i);
                System.out.println("Customer: " + tempCustomer.getName() + "[" + (i + 1) + "]");
            }

        } else {

            System.out.println("Customer details for branch " + tempBranch.getName());
            for (int i = 0; i < tempBranch.getCustomers().size(); i++) {
                Customer tempCustomer = tempBranch.getCustomers().get(i);
                System.out.println("Customer: " + tempCustomer.getName() + "[" + (i + 1) + "]");
                System.out.println("Transactions");
                for (int j = 0; j < tempCustomer.getTransactions().size(); j++) {
                    System.out.println("[" + (j + 1) + "]  Amount " + tempCustomer.getTransactions().get(j).doubleValue());
                }
            }
        }
        return true;
    }
}
