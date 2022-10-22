package secondLab.entity;

public class Appliance implements Comparable<Appliance> {

	/**
	 * Appliance price
	 */
	@XmlElement
	private double price;

	/**
	 * Appliance constructor with certain values
	 *
	 * @param price appliance price
	 * @see Appliance#Appliance()
	 */
	Appliance(double price) {
		this.price = price;
	}

	/**
	 * Appliance constructor
	 *
	 * @see Appliance#Appliance(double)
	 */
	Appliance() {
		this.price = 0;
	}

	/**
	 * Price getter
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return Return instance info
	 */
	@Override
	public String toString() {
		return String.format("Price: %f", this.price);
	}

	/**
	 * Compare appliance by price
	 *
	 * @param o appliance
	 * @return 1 if this instance is greater, -1 - if lower, 0 - if equals
	 */
	public int compareTo(Appliance o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		}
		return 0;
	}
}
