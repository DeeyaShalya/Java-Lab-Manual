package experiment;

import java.util.Scanner;

public class NameValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt for the name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        try {
            // Step 2: Validate the name
            validateName(name);

            // Step 3: If validation successful, display success message
            System.out.println("Valid name: " + name);
        } catch (InvalidNameException e) {
            // Step 4: If validation fails, catch the exception and display error message
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    // Method to validate the name
    private static void validateName(String name) throws InvalidNameException {
        // Check if the name contains any numeric value
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new InvalidNameException("Invalid Name: Name cannot contain numeric value.");
            }
        }
    }
}

// Custom exception class for invalid name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }

}
