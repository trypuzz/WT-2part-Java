package secondLab.service.implem;
import secondLab.entity.Criteria;
import secondLab.service.ApplianceService;

import java.util.List;
/** Implementation of appliance service interface */
public class ApplianceServiceImpl implements ApplianceService {

	/**
	 * Validate criterias and call DAO find method
	 *
	 * @param criteria search criterias
	 * @return List of appliance
	 */
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliance = applianceDAO.find(criteria);

		return appliance;
	}

	/**
	 * Call DAO sortByPrice method
	 *
	 * @return List of appliance
	 */
	public List<Appliance> sortByPrice() {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances = applianceDAO.sortByPrice();

		return appliances;
	}
}
