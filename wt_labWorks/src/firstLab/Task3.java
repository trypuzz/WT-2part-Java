package firstLab;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int h = scanner.nextInt();
		System.out.println(" # | x | F ");

		for (int i = 0; i <= (b - a) / h; i++) {
			System.out.print(i + " | " + a + "|" +Math.tan(a));
			a += h;
			System.out.println();
		}
	}
}
