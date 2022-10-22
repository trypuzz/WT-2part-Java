package secondLab.main;

public class PrintApplianceInfo {
	/**
	 * Print list of appliances
	 *
	 * @param appliances list of appliances
	 */
	public static void print(List<Appliance> appliances) {
		System.out.println("Search result:");
		if (appliances != null) {
			for (Appliance appliance : appliances) {
				System.out.println(appliance);
			}
		} else {
			System.out.println("Not found");
		}
		System.out.println();
	}

	/**
	 * Print a single appliance
	 *
	 * @param appliance appliance
	 */
	public static void print(Appliance appliance) {
		if (appliance != null) {
			System.out.println(appliance);
		} else {
			System.out.println("No appliance");
		}
	}
}
