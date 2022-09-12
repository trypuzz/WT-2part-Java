package firstLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {
	public static void main(String[] args) {
		List<Integer> in = new ArrayList<Integer>() {
			{add(-10); add(2); add(2); add(5); add(10); add(88);}
		};

		List<Integer> from = new ArrayList<Integer>() {
			{add(-1); add(3); add(4); add(7); add(99);}
		};

		List<Integer> indexes = gimmeIndexes(in, from);
		System.out.println("нужно вставить на следующие места: " + indexes);

		for (int i = 0; i < indexes.size(); i++)  in.add(indexes.get(i), from.get(i));
		System.out.println("После вставки "+ in);
	}

	private static List<Integer> gimmeIndexes(List<Integer> in, List<Integer> from) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < from.size(); i++) {
			int dex = Collections.binarySearch(in, from.get(i));
			if (dex < 0) result.add(-(dex + 1) + i);
			else result.add(dex + i);
		}
		return result;
	}
}