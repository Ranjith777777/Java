package pratices.index;

abstract class Banking {

    double balance = 0;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends Banking {

    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance" + balance);
        } else {
            System.out.println("balance:theriyala");
        }
    }
}

public class Abstract_classtask3 {
    public static void main(String[] args) {

        Banking e1 = new SavingsAccount();

        e1.deposit(5000);
        e1.withdraw(2000);
        e1.withdraw(4000);
    }
}
