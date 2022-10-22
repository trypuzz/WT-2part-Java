package secondLab.entity;

import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "Appliances")
@XmlAccessorType(XmlAccessType.FIELD)
public class Appliances implements Serializable {

	/** List of Appliance */
	@XmlElements({ @XmlElement(name = "Appliance", type = Appliance.class),
	        @XmlElement(name = "Laptop", type = Laptop.class), @XmlElement(name = "Oven", type = Oven.class),
	        @XmlElement(name = "Refrigerator", type = Refrigerator.class),
	        @XmlElement(name = "Speakers", type = Speakers.class),
	        @XmlElement(name = "TabletPC", type = TabletPC.class),
	        @XmlElement(name = "VacuumCleaner", type = VacuumCleaner.class),
	        @XmlElement(name = "Teapot", type = Teapot.class) })
	private List<Appliance> appliances;

	/**
	 * Appliance getter
	 */
	public List<Appliance> getAppliances() {
		return appliances;
	}

	/**
	 * Appliance setter
	 */
	public void setAppliances(List<Appliance> appliances) {
		this.appliances = appliances;
	}
}
