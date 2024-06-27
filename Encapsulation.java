public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation
        BankAcc acc = new BankAcc();
        acc.accNo = 1234567890;
        // acc.accName = "Raghav";
        acc.balance = 2589526.34;
        acc.display();
    }
}

class BankAcc {
    // Properties
    protected long accNo;
    private String accName; // This will give error because of private
    public double balance;

    void display() {
        System.out.println("Account No: " + accNo + "\nAccount Name: " + accName + "\nBalance: " + balance);
    }
}