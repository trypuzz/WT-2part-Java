package secondLab.service;

import java.io.File;
import java.util.List;

/** JAXB service API */
public interface JAXBService {
	/**
	 * Deserializes data from xml file list of appliance
	 *
	 * @param file DB file
	 * @return List of appliance
	 */
	List<Appliance> unmarshalAppliance(File file);
}