//Write a program requesting a user to enter the password, if successful return login successful and if invalid user have only 3 chances and if password blocked for 24 hrs

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chance = 3;
        String pass = "abc@123";
        while (chance > 0) {
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            if (password.equals(pass)) {
                System.out.println("Welcome to my space\nSelect from below\n1. Ice cream\n2. Puffs\n3. Cold Drinks\n4. Buns");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Enjoy your Ice Cream");
                    break;
                } else if (option == 2) {
                    System.out.println("Enjoy you Puff");
                    break;
                }
            } else {
                System.out.println("Invalid password, please try again");
                chance--;
                System.out.println("You have " + chance + " chances left");
            }
        }
        if (chance == 0) {
            System.out.println("Your card has been blocked for 24hrs!");
        }
        scanner.close();
    }
}
