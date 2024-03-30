package experiment;
import java.util.Scanner;
public class EvenOddThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (up to 10): ");
        int range = scanner.nextInt();

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= range; i += 2) {
                System.out.println("Even: " + i);
            }
        });
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= range; i += 2) {
                System.out.println("Odd: " + i);
            }
        });
        evenThread.start();
        oddThread.start();
	}
}
