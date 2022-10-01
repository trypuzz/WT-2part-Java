package firstLab.task_9;
public class Ball {
	private String color;
	private double weight;

	public double getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}

	public Ball(double weight, String color) {
		this.weight = weight;
		this.color = color;
	}
}