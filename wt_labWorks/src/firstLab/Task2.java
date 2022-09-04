package firstLab;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter scale: ");
		int scale = scanner.nextInt();

		System.out.print("Enter X of the point: ");
		int pointX = scanner.nextInt();
		System.out.print("Enter Y of the point: ");
		int pointY = scanner.nextInt();

		checkMatch(scale, pointX, pointY);
	}

	private static void checkMatch(int scale, int pointX, int pointY) {
		boolean flag;
		if ((pointX >= -4 * scale && pointX <= 4 * scale) && (pointY <= 5 * scale && pointY >= 0)) {
			flag = true;
			System.out.println("Point is in this area (flag = " + flag + ")");
		} else if ((pointX >= -6 * scale && pointX <= 6 * scale) && (pointY >= 3 * scale && pointY <= 0)){
			flag = true;
			System.out.println("Point is in this area (flag = " + flag + ")");
		} else {
			flag = false;
			System.out.println("Point is not in this area (flag = " + flag + ")");
		}

	}
}
