package secondLab.service;
/** Helper service API */
public interface HelperService {
	/**
	 * Converts enumeration value to method getter name
	 *
	 * @param enumValue enum string value
	 * @return Method getter name
	 */
	String getMethodGetterName(String enumValue);

	/**
	 * Makes a method call by name
	 *
	 * @param methodName method name
	 * @param instance   object on which the method is called
	 * @return Call result
	 */
	Object methodCaller(String methodName, Object instance);
}
