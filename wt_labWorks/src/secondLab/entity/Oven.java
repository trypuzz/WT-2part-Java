package secondLab.entity;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Oven extends Appliance {
	@XmlElement
	private int powerConsumption;
	@XmlElement
	private double weight;
	@XmlElement
	private double capacity;
	@XmlElement
	private double depth;
	@XmlElement
	private double heigth;
	@XmlElement
	private double width;

	public Oven(double price, int powerConsumption, double weight, double capacity, double depth, double heigth,
	            double width) {
		super(price);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.setCapacity(capacity);
		this.setDepth(depth);
		this.setHeigth(heigth);
		this.setWidth(width);
	}

	public Oven() {
		super(0);
		this.powerConsumption = 0;
		this.weight = 0;
		this.setCapacity(0);
		this.setDepth(0);
		this.setHeigth(0);
		this.setWidth(0);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	@Override
	public String toString() {
		return String.format(
		        "Oven:\n %s, Power consumption: %d, Weight: %f, Capacity: %f, Depth: %f, Heigth: %f, Width: %f",
		        super.toString(), this.powerConsumption, this.weight, this.capacity, this.depth, this.heigth,
		        this.width);
	}
}
