import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (/)");
        System.out.println("6.  Exponentiation (/)");

        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validChoice = false;
                }
                break;
            case 5: // Modulus
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case 6: // Exponentiation
                    result = Math.pow(num1, num2);
                    System.out.println(num1 + " ^ " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation");
                 validChoice = false;
        }

        if (validChoice) {
            System.out.println("Thank you for using the Basic Calculator!");
        }

        scanner.close();
    }
}
