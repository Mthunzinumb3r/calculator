import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Calculator!");
            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result;
            switch (choice) {
                case 1 -> {
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                }
                case 2 -> {
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                }
                case 3 -> {
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                }
                case 4 -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default ->
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
            // Close the scanner
        }
    }
}
