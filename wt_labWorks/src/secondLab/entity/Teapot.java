package secondLab.entity;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Teapot extends Appliance {
	@XmlElement
	private int powerConsumption;
	@XmlElement
	private double capacity;
	@XmlElement
	private String bodyMatterial;

	public Teapot(double price, int powerConsumption, double capacity, String bodyMatterial) {
		super(price);
		this.powerConsumption = powerConsumption;
		this.capacity = capacity;
		this.bodyMatterial = bodyMatterial;
	}

	public Teapot() {
		super(0);
		this.powerConsumption = 0;
		this.capacity = 0;
		this.bodyMatterial = "";
	}

	public String getBodyMatterial() {
		return bodyMatterial;
	}

	public void setBodyMatterial(String bodyMatterial) {
		this.bodyMatterial = bodyMatterial;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return String.format("Teapot:\n %s, Power consumption: %d, Capacity: %f, Body matterial: %s", super.toString(),
		        this.powerConsumption, this.capacity, this.bodyMatterial);
	}
}
