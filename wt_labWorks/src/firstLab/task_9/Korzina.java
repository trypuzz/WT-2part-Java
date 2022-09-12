package firstLab.task_9;

import java.util.ArrayList;
import java.util.List;

public class Korzina {

	static List<Ball> ballsCollection = new ArrayList<>();

	public static void main(String[] args) {
		ballsCollection.add(new Ball("Blue", 2.1));
		ballsCollection.add(new Ball("Yellow", 2.6));
		ballsCollection.add(new Ball("Blue", 3.5));
		ballsCollection.add(new Ball("Blue", 6.21));
		ballsCollection.add(new Ball("Red", 8.2));
		ballsCollection.add(new Ball("Green", 9.1));

		int[] ballsArray = new int[ballsCollection.size()-1];
		//ballsArray = ballsCollection.toArray();

		System.out.println(countWeight(ballsCollection));
		System.out.println(countBlueBalls(ballsCollection));
	}

	private static double countWeight(List<Ball> ballsCollection) {
		return ballsCollection.stream().mapToDouble(ball -> ball.weight).sum();
	}

	private static int countBlueBalls(List<Ball> ballsCollection) {
		int counter = 0;
		Ball ball = ballsCollection.get(ballsCollection.size()-1);
		for (int i = 0; i < ballsCollection.size(); i++) {
			if ( ball.color=="Blue"){
				counter++;
			}
		}

		return counter;
	}
}
