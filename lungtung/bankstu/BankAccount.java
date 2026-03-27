package lungtung.bankstu;

public class BankAccount {
   private String owner;
   private double balance;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    boolean debit(double amount){
    if (amount > balance){
    return false ;
    }
    else {
    balance -= amount;
    return true ;
    }
}
    void credit ( double amount){
    balance += amount;
    }
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}