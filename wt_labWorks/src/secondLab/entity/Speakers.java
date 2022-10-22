package secondLab.entity;


import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Speakers extends Appliance {
	@XmlElement
	private int powerConsumption;
	@XmlElement
	private int numberOfSpeakers;
	@XmlElement
	private String frequencyRange;
	@XmlElement
	private int cordLength;

	public Speakers(double price, int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
		super(price);
		this.setPowerConsumption(powerConsumption);
		this.setNumberOfSpeakers(numberOfSpeakers);
		this.setFrequencyRange(frequencyRange);
		this.setCordLength(cordLength);
	}

	public Speakers() {
		super(0);
		this.setPowerConsumption(0);
		this.setNumberOfSpeakers(0);
		this.setFrequencyRange("");
		this.setCordLength(0);
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
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
		        "Speakers:\n %s, Power consumption: %d, Number of speakers: %d, Frequency range: %s, cordLength: %d",
		        super.toString(), this.powerConsumption, this.numberOfSpeakers, this.frequencyRange, this.cordLength);
	}
}
