package secondLab.entity;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Refrigerator extends Appliance {
	@XmlElement
	private int powerConsumption;
	@XmlElement
	private double weight;
	@XmlElement
	private int freezerCapacity;
	@XmlElement
	private int overallCapacity;
	@XmlElement
	private double heigth;
	@XmlElement
	private double width;

	public Refrigerator(double price, int powerConsumption, double weight, int freezerCapacity, int overallCapacity,
	                    double heigth, double width) {
		super(price);
		this.setPowerConsumption(powerConsumption);
		this.setWeight(weight);
		this.setFreezerCapacity(freezerCapacity);
		this.setOverallCapacity(overallCapacity);
		this.setHeigth(heigth);
		this.setWidth(width);
	}

	public Refrigerator() {
		super(0);
		this.setPowerConsumption(0);
		this.setWeight(0);
		this.setFreezerCapacity(0);
		this.setOverallCapacity(0);
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

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
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
		        "Refrigerator:\n %s, Power consumption: %d, Weight: %f, Freezer capacity: %d, Overall capacity: %d, Heigth: %f, Width: %f",
		        super.toString(), this.powerConsumption, this.weight, this.freezerCapacity, this.overallCapacity,
		        this.heigth, this.width);
	}
}

