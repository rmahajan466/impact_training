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
                System.out.println("Login Success!");
                System.out.println(
                        "Welcome to Ice Cream Parlour\nSelect from below\n1. Ice cream\n2. Puffs\n3. Cold Drinks\n4. Buns");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Which flavour you want?");
                    System.out.println(
                            "1. Vanilla -> 10/- \n2. Chocolate -> 60/- \n3. Strawberry -> 40/- \n4. RajBhog 50/-");
                    int flavour = scanner.nextInt();
                    if (flavour == 1) {
                        System.out.print("How many ice creams do you want?: ");
                        int quantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (10 * quantity));
                        System.out.println("Enjoy your Ice Cream");
                    } else if (flavour == 2) {
                        System.out.print("How many ice creams do you want?: ");
                        int quantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (60 * quantity));
                        System.out.println("Enjoy your Ice Cream");
                    } else if (flavour == 3) {
                        System.out.print("How many ice creams do you want?: ");
                        int quantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (40 * quantity));
                        System.out.println("Enjoy your Ice Cream");
                    } else if (flavour == 3) {
                        System.out.print("How many ice creams do you want?: ");
                        int quantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (50 * quantity));
                        System.out.println("Enjoy your Ice Cream");
                    } else {
                        System.out.println("Invalid Input!");
                    }
                    break;
                } else if (option == 2) {
                    System.out.println(
                            "Which Puff do you want? \n1. Masala Puff -> 50/- \n2. Cheese Puff -> 70/- \n3. Chinese Puff -> 60/- ");
                    int puff = scanner.nextInt();
                    if (puff == 1) {
                        System.out.print("How many Puffs do you want? ");
                        int puffQuantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (50 * puffQuantity));
                        System.out.println("Enjoy Your puff");
                    } else if (puff == 2) {
                        System.out.print("How many Puffs do you want? ");
                        int puffQuantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (70 * puffQuantity));
                        System.out.println("Enjoy Your puff");
                    } else if (puff == 3) {
                        System.out.print("How many Puffs do you want? ");
                        int puffQuantity = scanner.nextInt();
                        System.out.println("Your total bill is: " + (60 * puffQuantity));
                        System.out.println("Enjoy Your puff");
                    } else {
                        System.out.println("Invalid Input!");
                    }
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
