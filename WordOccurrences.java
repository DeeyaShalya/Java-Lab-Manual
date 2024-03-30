package experiment;
import java.util.Scanner;

public class WordOccurrences {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        System.out.println("Enter the word to find its occurrences:");
        String word = scanner.nextLine();

        int index = text.indexOf(word);
        int count = 0;
        while (index != -1) {
            count++;
            System.out.println("Found at index: " + index);
            index = text.indexOf(word, index + 1);
        }
        System.out.println("Total occurrences: " + count);
    }

}
