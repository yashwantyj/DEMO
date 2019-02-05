package yash.CAB;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GrossaryValidator {
	static List<String> type = new ArrayList<String>();
	static {
		type.add("Fruit");
		type.add("Vegetable");
		type.add("Beverages");
	}

	public static boolean validateGrossaryName(String name) throws GrossaryException {
		String custPattern = "*[a-zA-Z]{3}";

		if ((name.isEmpty() || !"".equals(name)) && Pattern.matches(custPattern, name)) {
			return true;
		} else {
			throw new GrossaryException("Grossary Name should be max 3 letter");
		}
	}

	public static boolean validateGrossaryType(String Type) throws GrossaryException {
		if ((Type.isEmpty() || !"".equals(Type)) && type.contains(Type)) {
			return true;
		} else {
			throw new GrossaryException("It is not any grossary type");
		}
	}

	public static boolean validateGrossaryQuntity(String qun) throws GrossaryException {
		String custPattern = "\\d+";

		if (Pattern.matches(custPattern, qun)) {
			return true;
		} else {
			throw new GrossaryException("Quntity should be digit");
		}
	}

	public static boolean validateDate(String date) throws GrossaryException {
		String custPattern = "^\\d{2}-\\d{2}-\\d{4}$";

		if (Pattern.matches(custPattern, date)) {
			return true;
		} else {
			throw new GrossaryException("date should be in format dd-mm-yyyy");
		}
	}
}
