package experiment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int numElements = scanner.nextInt();
        
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Original list: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
	}
}
