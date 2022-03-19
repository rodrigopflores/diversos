package projetos.udemy;

public class BankAccount {

    private String name;
    private String email;
    private int accNum;
    private int phoneNum;
    private double balance;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        if (this.name.isEmpty()) return "Not registered";
        else return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        if (this.email.isEmpty()) return "Not registered";
        else return this.email;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getAccNum() {
        return this.accNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getPhoneNum() {
        return this.phoneNum;
    }

    public void deposit(double ammount){
        if (ammount < 0) System.out.println("The ammount should be positive");
        else {
            this.balance += ammount;
            System.out.println("Your balance is: "+ this.balance);
        }
    }

    public void withdraw(double ammount){
        if (ammount < 0) System.out.println("The ammount should be positive");
        else if (this.balance - ammount < 0) System.out.println("Not enough funds");
        else {
            this.balance -= ammount;
            System.out.println("Your balance is: "+ this.balance);
        }
    }


}
