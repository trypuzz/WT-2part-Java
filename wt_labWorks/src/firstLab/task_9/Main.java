package firstLab.task_9;

public class Main {
	public static void main(String[] args) {
		Basket basket = new Basket();
		basket.addBall(new Ball(5, "red"));
		basket.addBall(new Ball(22.5, "pink"));
		basket.addBall(new Ball(1.657, "blue"));
		basket.addBall(new Ball(3.8, "blue"));
		System.out.println(basket.calculateBallsWeight());
		System.out.println(basket.getBlueBallsCount());
	}
}
