package secondLab.service.implem;

import secondLab.service.HelperService;

import java.lang.reflect.Method;
/** Implementation of helper service interface */
public class HelperServiceImpl implements HelperService {

	/**
	 * Converts enumeration value to method getter name
	 *
	 * @param enumValue enum string value
	 * @return Method getter name
	 */
	public String getMethodGetterName(String enumValue) {
		enumValue = enumValue.toLowerCase();
		String result = "get" + (char) (enumValue.charAt(0) - ('a' - 'A'));

		for (int i = 1; i < enumValue.length(); i++) {
			char c = enumValue.charAt(i);
			if (c == '_') {
				i++;
				result = result + (char) (enumValue.charAt(i) - ('a' - 'A'));
			} else {
				result = result + c;
			}
		}
		return result;
	}

	/**
	 * Makes a method call by name
	 *
	 * @param methodName method name
	 * @param instance   object on which the method is called
	 * @return Call result
	 */
	public Object methodCaller(String methodName, Object instance) {
		try {
			Method method = instance.getClass().getDeclaredMethod(methodName);
			return method.invoke(instance);
		} catch (Exception e) {
			try {
				Method method = instance.getClass().getSuperclass().getDeclaredMethod(methodName);
				return method.invoke(instance);
			} catch (Exception ex) {
				return null;
			}
		}
	}
}
