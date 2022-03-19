package entities;

public class Account {
    private String holder;
    protected Double balance;
    private Integer number;

    public Account(){
    }

    public Account(String holder, Double balance, Integer number) {
        this.holder = holder;
        this.balance = balance;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void withdraw(Double amount){
        balance -= amount;
    }

    public void deposit(Double amount){
        balance += amount;
    }
}
