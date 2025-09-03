package Unit1;

// Step - 2
public class Bank {
    private int balance = 10000;
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not Enough Balance");
        }
        else{
            balance = amount;
            System.out.println("Withdrawal Successfully, Remaining Balance: " + balance);
        }
    }
}