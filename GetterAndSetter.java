public class GetterAndSetter {
    public static void main(String[] args) {
        // Encapsulation
        BankAcc acc = new BankAcc();
        acc.setter("Raghav");
        acc.balance = 2589526.34;
        acc.setter(1234567890);
        acc.display();
    }
}

class BankAcc {
    // Properties
    private long accNo;
    private String accName;
    protected double balance;

    // setter int
    void setter(int n) {
        this.accNo = n;
    }

    // getter int
    long getter() {
        return this.accNo;
    }

    // setter String
    void setter(String n) {
        this.accName = n;
    }

    // getter String
    String getterS() {
        return this.accName;
    }

    void display() {
        System.out.println("Account Name: " + getterS());
        System.out.println("Account Balance: " + balance);
        System.out.println("Account Number: " + getter());
    }
}
