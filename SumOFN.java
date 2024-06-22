//Write a program to return the sum of n natural numbers

import java.util.Scanner;

public class SumOFN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
}
