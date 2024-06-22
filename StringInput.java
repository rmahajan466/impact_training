import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("Enter int");
        int b = scanner.nextInt();

        System.out.println("Enter Float: ");
        float c = scanner.nextFloat();

        System.out.println("Welcome: " + name);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}
