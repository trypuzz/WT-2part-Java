package firstLab;

//import java.util.Random;
import java.util.Scanner;

public class Task7 {
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	void sort(int arr[]) {
		int n = arr.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i += 1) {
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//	Random random = new Random();

		System.out.println("Enter size of array: ");
		int n = scanner.nextInt();

		int array[] = new int[n];
		System.out.println("Array before sorting");
		printArray(array);

		Task7 ob = new Task7();
		ob.sort(array);

		System.out.println("Array after sorting");
		printArray(array);
	}
}
