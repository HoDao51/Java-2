package buoi1.lyThuyet.TinhDongGoi;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nap thanh cong so tien la: " + amount + "VND");
        }else {
            System.out.println("So tien khong hop le!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0){
            if (balance < amount) {
                System.out.println("So du khong du!");
                return false;
            } else {
                this.balance -= amount;
                System.out.println("Rut thanh cong so tien la: " + amount + "VND");
                return true;
            }
        }
        return false;
    }
}
