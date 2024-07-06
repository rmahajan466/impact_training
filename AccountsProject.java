import java.util.*;

public class AccountsProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. Create account\n2. Update account\n3. Delete Account\n4. View Account\n5. View all Account\n6. Transaction\n7. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Creating account!");
            } else if (choice == 2) {
                System.out.println("Update account!");
            } else if (choice == 3) {
                System.out.println("Delete account!");
            } else if (choice == 4) {
                System.out.println("View Account");
            } else if (choice == 5) {
                System.out.println("View all Account");
            } else if (choice == 6) {
                while (true) {
                    System.out.println("Transaction");
                    System.out.println("Your Choices\n1. Debit\n2. Credit\n3. View Balance\n4. Exit");
                    System.out.print("Enter your transaction Type: ");
                    int transactionType = scanner.nextInt();
                    if (transactionType == 1) {
                        System.out.println("Debit");
                    } else if (transactionType == 2) {
                        System.out.println("Credit");
                    } else if (transactionType == 3) {
                        System.out.println("View Balance");
                    } else if (transactionType == 4) {
                        System.out.println("Exit");
                        break;
                    } else {
                        System.out.println("Invalid Choice");
                    }
                }
            } else if (choice == 7) {
                System.out.println("Exiting program!\nThanks for using our service!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }

        }

        scanner.close();
    }
}

class generateRandom {

    public static long accountCreation() {
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 10000000 - 1
        long rand_long = rand.nextLong(10000000);

        return rand_long;

    }
}

class AccountDetails {

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Your Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Your Password: ");
        long balance = scanner.nextLong();

        System.out.println("Enter Your Address: ");
        String address = scanner.nextLine();

        long accountNumber = 1234567890;

        System.out.println("Account Created Successfully!");
        scanner.close();
    }

    public static void Update() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what you want to update?");
        System.out.println("1. email\n2. phone\n3. address");
        int update = scanner.nextInt();

        if (update == 1) {
            System.out.println("Enter your new email: ");
            String email = scanner.nextLine();
            System.out.println("Email Updated Successfully!");
        }

        else if (update == 2) {
            System.out.println("Enter your new phone: ");
            String phone = scanner.nextLine();
            System.out.println("Phone Updated Successfully!");
        }

        else if (update == 3) {
            System.out.println("Enter your new address: ");
            String address = scanner.nextLine();
            System.out.println("Address Updated Successfully!");
        }

        else {
            System.out.println("Invalid Choice!");
        }
        scanner.close();
    }

    public static void deleteAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to delete your account?");
        System.out.println("1. Yes\n2. No");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Account Deleted Successfully!");
        } else if (choice == 2) {
            System.out.println("Account Not Deleted!");
        } else {
            System.out.println("Invalid Choice!");
        }
        scanner.close();
    }

    public static void viewAccount() {
        // printing array with for each loop
    }

    public static void allAccount() {
        // printing all arrays with for each loop
    }

    private long debit() {
        /*
         * 1. Check if the account number is valid
         * 2. Check if the amount is valid
         * 3. Check if the account has enough balance
         * 4. If all checks are passed, debit the amount from the account and return the
         * account balance
         */
        return 12345678;
        // sample output
    }

    private long credit() {
        /*
         * account check and add the amount to the balance
         */
        return 12345678;
        // sample output
    }

    private long balance() {
        return 12345678;
        // sample output
    }

}
