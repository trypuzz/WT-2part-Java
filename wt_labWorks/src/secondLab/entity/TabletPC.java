package secondLab.entity;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TabletPC extends Appliance {
	@XmlElement
	private int batteryCapacity;
	@XmlElement
	private double displayInches;
	@XmlElement
	private int memoryRom;
	@XmlElement
	private int flashMemoryCapacity;
	@XmlElement
	private String color;

	public TabletPC(double price, int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity,
	                String color) {
		super(price);
		this.setBatteryCapacity(batteryCapacity);
		this.setDisplayInches(displayInches);
		this.setMemoryRom(memoryRom);
		this.setFlashMemoryCapacity(flashMemoryCapacity);
		this.setColor(color);
	}

	public TabletPC() {
		super(0);
		this.setBatteryCapacity(0);
		this.setDisplayInches(0);
		this.setMemoryRom(0);
		this.setFlashMemoryCapacity(0);
		this.setColor("");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		return String.format(
		        "TabletPC:\n %s, Battery capacity: %d, Display inches: %f, Memory ROM: %d, Flash memory capacity: %d, Color: %s",
		        super.toString(), this.batteryCapacity, this.displayInches, this.memoryRom, this.flashMemoryCapacity,
		        this.color);
	}

}

