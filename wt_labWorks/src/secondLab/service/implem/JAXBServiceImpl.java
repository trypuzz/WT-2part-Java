package secondLab.service.implem;
import secondLab.entity.Appliances;
import secondLab.service.JAXBService;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/** Implementation of JAXB service interface */
public class JAXBServiceImpl implements JAXBService {

	/**
	 * Deserializes data from xml file list of appliance
	 *
	 * @param file DB file
	 * @return List of appliance
	 */
	public List<Appliance> unmarshalAppliance(File file) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Appliances.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Appliances appliances = (Appliances) jaxbUnmarshaller.unmarshal(file);
			return appliances.getAppliances();
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
