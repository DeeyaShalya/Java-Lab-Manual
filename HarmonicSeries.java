package experiment;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int num = scanner.nextInt();
	        double sum = 0.0;

	        while (num>0) {
	            sum = sum + (double)1/num;
	            num--;
	        }
			System.out.println("Sum of the harmonic series up to " + num + " terms: " + sum);
	    }

	}

