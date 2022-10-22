package secondLab.entity;

/** Appliance search criteria class which contains category enums */
public final class SearchCriteria {

	public static enum Appliance {
		PRICE
	}

	public static enum Oven {
		PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}

	public static enum Laptop {
		PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}

	public static enum Refrigerator {
		PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}

	public static enum VacuumCleaner {
		PRICE, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}

	public static enum TabletPC {
		PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
	}

	public static enum Teapot {
		PRICE, POWER_CONSUMPTION, CAPACITY, BODY_MATERIAL
	}

	public static enum Speakers {
		PRICE, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}

	private SearchCriteria() {
	}
}

