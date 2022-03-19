package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(String holder, Double balance, Integer number, Double loanLimit) {
        super(holder, balance, number);
        this.loanLimit = loanLimit;
    }

    public void loan(Double ammount) {
        if (ammount <= loanLimit) {
            deposit(ammount);
            loanLimit -= ammount;
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
}
