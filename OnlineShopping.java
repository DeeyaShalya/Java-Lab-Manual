package experiment;
import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to online shopping!");
        
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View items");
            System.out.println("2. Add item to cart");
            System.out.println("3. Remove item from cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Viewing available items...");
                    // Add code to display available items
                    break;
                case 2:
                    System.out.println("Adding item to cart...");
                    // Add code to add item to cart
                    break;
                case 3:
                    System.out.println("Removing item from cart...");
                    // Add code to remove item from cart
                    break;
                case 4:
                    System.out.println("Checking out...");
                    // Add code to calculate total and process payment
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while(choice != 5);
        
        System.out.println("Thank you for shopping with us!");
	}
}
