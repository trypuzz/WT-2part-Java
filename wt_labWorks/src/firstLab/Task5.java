package firstLab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Enter N: ");
		int n = scanner.nextInt();
		int[] tableArray = new int[n];

		fillAndPrintFirstArray(random, tableArray);

		Arrays.sort(tableArray);
		System.out.println();

		int newSize = 0;
		int[] finalArray = getFinalArray(n, tableArray, newSize);

		System.out.println("Beginning sorted array: "+Arrays.toString(tableArray));
		System.out.println("Final Array Size = " + finalArray.length);
		System.out.println("Final array: "+Arrays.toString(finalArray));
		System.out.println("You can delete " + (tableArray.length-finalArray.length) + " elements");
	}

	private static int[] getFinalArray(int n, int[] tableArray, int newSize) {
		for (int i = 0; i < tableArray.length - 1; i++) {
			if (tableArray[i] == tableArray[i + 1]) {
				newSize++;
			}
		}
		int[] finalArray = new int[n - newSize];

		int j=0;
		for (int i = 0; i < tableArray.length-1; i++) {
			finalArray[0] = tableArray[0];
			if (tableArray[i+1] != tableArray[i]) {
				j++;
				finalArray[j] = tableArray[i+1];
			}
		}
		return finalArray;
	}

	private static void fillAndPrintFirstArray(Random random, int[] tableArray) {
		for (int i = 0; i < tableArray.length; i++) {
			tableArray[i] = random.nextInt(10);
		}

		for (int i = 0; i < tableArray.length; i++) {
			System.out.print(tableArray[i] + "    ");
		}
	}
}
