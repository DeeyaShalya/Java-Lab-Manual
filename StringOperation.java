package experiment;
import java.util.Arrays;
import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Sort strings alphabetically
        String[] strings = {str1, str2};
        Arrays.sort(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));

        // Check if one string is a substring of another
        if (str1.contains(str2) || str2.contains(str1)) {
            System.out.println("One string is a substring of another.");
        } else {
            System.out.println("One string is not a substring of another.");
        }

        // Convert strings to uppercase
        System.out.println("Uppercase of first string: " + str1.toUpperCase());
        System.out.println("Uppercase of second string: " + str2.toUpperCase());
    }
}


