package secondLab.DAO;


/** DAO factory class */
public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

	private DAOFactory() {
	}

	/**
	 * ApplianceDAO getter
	 *
	 * @return ApplianceDAO instance
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	/**
	 * DAOFactory getter
	 *
	 * @return DAOFactory instance
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
