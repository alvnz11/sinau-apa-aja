package src;

import java.util.Scanner;

public class hfdhf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from stdin
        int intValue = scanner.nextInt();

        // Read a double from stdin
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Read a String from stdin
        String stringValue = scanner.nextLine();

        // Print the values as required
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        // Close the scanner
        scanner.close();
    }
}