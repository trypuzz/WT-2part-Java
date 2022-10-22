package secondLab.service.validate;

import secondLab.entity.Criteria;
import secondLab.entity.SearchCriteria;

public class Validator {

	/**
	 * Validate criterias
	 *
	 * @param criteria search criterias
	 * @return Result of validation
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		String groupSearchName = criteria.getGroupSearchName();

		for (String key : criteria.getCriterias().keySet()) {
			try {
				if (groupSearchName.equals("Appliance"))
					SearchCriteria.Appliance.valueOf(key);
				else if (groupSearchName.equals("Laptop"))
					SearchCriteria.Laptop.valueOf(key);
				else if (groupSearchName.equals("Oven"))
					SearchCriteria.Oven.valueOf(key);
				else if (groupSearchName.equals("Refrigerator"))
					SearchCriteria.Refrigerator.valueOf(key);
				else if (groupSearchName.equals("Speakers"))
					SearchCriteria.Speakers.valueOf(key);
				else if (groupSearchName.equals("TabletPC"))
					SearchCriteria.TabletPC.valueOf(key);
				else if (groupSearchName.equals("VacuumCleaner"))
					SearchCriteria.VacuumCleaner.valueOf(key);
				else if (groupSearchName.equals("Teapot"))
					SearchCriteria.Teapot.valueOf(key);
				else
					return false;
			} catch (IllegalArgumentException e) {
				return false;
			}
		}
		return true;
	}

}