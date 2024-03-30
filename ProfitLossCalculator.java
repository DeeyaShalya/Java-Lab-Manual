package experiment;

import java.util.Scanner;

public class ProfitLossCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt for the cost price
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        // Step 2: Prompt for the selling price
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        // Step 3: Calculate profit or loss percentage
        double profitOrLoss = sellingPrice - costPrice;
        double profitLossPercentage = (profitOrLoss / costPrice) * 100;

        // Step 4: Display profit or loss percentage
        if (profitOrLoss > 0) {
            System.out.println("Profit Percentage: " + profitLossPercentage + "%");
        } else if (profitOrLoss < 0) {
            System.out.println("Loss Percentage: " + profitLossPercentage + "%");
        } else {
            System.out.println("No profit, no loss.");
        }

        scanner.close();
	}

}
