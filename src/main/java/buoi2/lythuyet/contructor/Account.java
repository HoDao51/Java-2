package buoi2.lythuyet.contructor;

public class Account {
    private String accountNumber;
    private double balance;
    private String owner;

    public Account(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public Account(String accountNumber, String owner){
        this(accountNumber, 0.0, owner);
    }

    public Account deposit(double amount){
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return this;
    }

    public void transfer(Account target, double amount){
        if (amount > 0 && target != null && balance >= amount) {
            this.balance -= amount;
            target.balance += amount;
            this.logTransaction(target, amount);
        } else {
            System.out.println("Giao dịch không hợp lệ!");
        }
    }

    public void logTransaction(Account target, double amount){
        System.out.println(this.owner + " Transferred " + amount + " to " + target.owner);
    }
}
