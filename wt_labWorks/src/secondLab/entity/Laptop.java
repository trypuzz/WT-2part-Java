package secondLab.entity;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Laptop extends Appliance {
	@XmlElement
	private double batteryCapacity;
	@XmlElement
	private String os;
	@XmlElement
	private int memoryRom;
	@XmlElement
	private int systemMemory;
	@XmlElement
	private String cpu;
	@XmlElement
	private double displayInches;

	public Laptop(double price, double batteryCapacity, String os, int memoryRom, int systemMemory, String cpu,
	              double displayInches) {
		super(price);
		this.setBatteryCapacity(batteryCapacity);
		this.setOs(os);
		this.setMemoryRom(memoryRom);
		this.setSystemMemory(systemMemory);
		this.setCpu(cpu);
		this.setDisplayInches(displayInches);
	}

	public Laptop() {
		super(0);
		this.setBatteryCapacity(0);
		this.setOs("");
		this.setMemoryRom(0);
		this.setSystemMemory(0);
		this.setCpu("");
		this.setDisplayInches(0);
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		return String.format(
		        "Laptop:\n %s, Battery capacity: %f, OS: %s, Memory ROM: %d, System memory: %d, CPU: %s, Display inches: %f",
		        super.toString(), this.batteryCapacity, this.os, this.memoryRom, this.systemMemory, this.cpu,
		        this.displayInches);
	}
}
