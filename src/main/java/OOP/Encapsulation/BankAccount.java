package OOP.Encapsulation;

public class BankAccount {

    //Imagine a BankAccount class that has a private attribute balance.
    //To modify or access the value of this balance, methods such as Deposit() and Withdraw() are used.

    private double balance; //encapsulation

    public String name;
    public String bankName;


    // Public method to add an amount to the balance
    public void deposit(double amount) {
        balance += amount;
    }

    // Public method to withdraw an amount from the balance
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }


    /*
    By using encapsulation, we ensure that an object's data is not accessed or modified in an uncontrolled manner.
    In the example, the balance is protected from direct access, and interaction with it is only done through the defined methods (deposit, withdraw, getBalance).
    */
}
