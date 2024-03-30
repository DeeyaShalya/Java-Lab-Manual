package experiment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCopyExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Take user input for the range
        System.out.print("Enter the number of elements in the list: ");
        int numElements = scanner.nextInt();
        // Step 2: Fill elements into a list based on user input
        List<Integer> originalList = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            originalList.add(scanner.nextInt());
        }
        // Step 3: Copy elements in reverse order into another list
        List<Integer> reversedList = new ArrayList<>();
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
        // Step 4: Print the original list
        System.out.println("Original List: " + originalList);
        // Step 5: Print the reversed list
        System.out.println("Reversed List: " + reversedList);
        scanner.close();
    }
}
