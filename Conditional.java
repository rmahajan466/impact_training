import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        // Here we are going to apply conditional statements with operators
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = obj.nextInt();

        if (num == 0) {
            System.out.println("Number is 0");
        } else if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
        obj.close();
    }
}
