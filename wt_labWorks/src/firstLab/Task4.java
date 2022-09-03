package firstLab;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int n = scanner.nextInt();
		int[] myArray = new int[n];

		for (int i = 0; i < n; i++) {
			myArray[i]= random.nextInt(100);
			System.out.print(myArray[i] + ", ");
		}
		System.out.println();

		for (int i = 0; i < myArray.length; i++) {
			boolean flag = true;
			for (int j = 2; j < myArray[i]; j++) {
				if (myArray[i] % j == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println(i + ") " + myArray[i]);
			}
		}
	}
}
