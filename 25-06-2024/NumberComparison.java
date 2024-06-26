import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 != num3) {
            System.out.println("num1 and num2 are equal but num3 is different!");
        }
        else if (num1 != num2 && num2 == num3){
            System.out.println("num2 and num3 are equal but num1 is different!");
        }
        else if (num2 != num1 && num1 == num3){
            System.out.println("num1 and num3 are equal but num2 is different!");
        }
        else if(num1>num2 && num1 > num3){
            System.out.println(num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3);
        }
        else {
            System.out.println("All num are equal!");
        }
        scanner.close();
    }
}
