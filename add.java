import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Add the numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
