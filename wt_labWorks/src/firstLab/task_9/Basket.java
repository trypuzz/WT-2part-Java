package firstLab.task_9;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Ball> balls = new ArrayList<Ball>();

	public void addBall(Ball ball) {
		balls.add(ball);
	}

	public double calculateBallsWeight() {
		double summa = 0;
		for (Ball ball : balls) {
			summa += ball.getWeight();
		}
		return summa;
	}

	public int getBlueBallsCount() {
		int count = 0;
		for (Ball ball : balls) {
			if (ball.getColor() == "blue")
				count++;
		}
		return count;
	}
}