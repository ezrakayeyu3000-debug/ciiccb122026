import java.util.Scanner;

public class Task7 {

    // Method 1: Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method 3: Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method 4: Division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));

        scanner.close();
    }
}