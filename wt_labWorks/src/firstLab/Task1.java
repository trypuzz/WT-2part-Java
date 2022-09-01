package firstLab;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		System.out.print("Enter Y: ");
		int y = scanner.nextInt();
		System.out.println("Value of expression is : " + sum(x, y));

	}

	public static double numerator(int x, int y) {
		return 1 + Math.pow(Math.sin(x + y), 2);
	}

	public static double denominator(int x, int y) {
		double intPart = numeratorInDenominator(x) / denominatorInDenominator(x, y);
		double fractionalPart = 0;
		return 2 + Math.abs(x - (intPart + fractionalPart));
	}

	public static int numeratorInDenominator(int x) {
		return 2 * x;
	}

	public static double denominatorInDenominator(int x, int y) {
		return 1 + Math.pow(x * y, 2);
	}

	public static double sum(int x, int y) {
		double intPart = numerator(x, y) / denominator(x, y);
		double fractionalPart = 0;
		return intPart + fractionalPart + x;
	}
}
