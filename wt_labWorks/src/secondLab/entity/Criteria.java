package secondLab.entity;


import java.util.HashMap;
import java.util.Map;

/** Search criteria of appliance */
public class Criteria {

	/** Appliance name */
	private String groupSearchName;
	/** List of criteria */
	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Criteria constructor with certain values
	 *
	 * @param groupSearchName appliance name
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * groupSearchName getter
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add new criteria
	 *
	 * @param searchCriteria criteria
	 * @param value value of criteria
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/**
	 * criterias getter
	 */
	public Map<String, Object> getCriterias() {
		return criteria;
	}

}
