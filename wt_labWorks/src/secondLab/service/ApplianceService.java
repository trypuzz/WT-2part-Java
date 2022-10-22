package secondLab.service;

import secondLab.entity.Criteria;

import java.util.List;


/** Appliance service API */
public interface ApplianceService {
	/**
	 * Searches for the specified criteria
	 *
	 * @param criteria search criterias
	 * @return List of appliance
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Sorts the list of appliance by price
	 *
	 * @return List of appliance
	 */
	List<Appliance> sortByPrice();
}

