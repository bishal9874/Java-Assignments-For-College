package College_Assignment;

import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal");
        } else if ((num1 == num2) || (num1 == num3) || (num3 == num2)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
