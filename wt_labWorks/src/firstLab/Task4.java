package firstLab;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] myArray = new int[n];

		for (int i = 0; i < myArray.length; i++) {
			int count = 0;
			for (int j = 0; j < myArray[i]; j++) {
				if (myArray[i] % j != 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i + ") " + myArray[i]);
			}
		}
	}
}
