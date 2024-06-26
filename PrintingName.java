import java.util.Scanner;

public class PrintingName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + Name(name));
        scanner.close();
    }

    // public static String Name() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("What is your name?: ");
    // String name = scanner.nextLine();
    // return name;
    // scanner.close();
    // }

    public static String Name(String name) {
        return name;
    }
}
