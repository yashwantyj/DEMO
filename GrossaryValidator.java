package yash.CAB;

import java.util.regex.Pattern;

public class GrossaryValidator {
	public  static  boolean validateref(String otp)throws CabException
	{
		String custPattern="\\d{5}";
		if(Pattern.matches(custPattern, otp))
		{
			return true;
		}
		else
		{
			throw new CabException("Cab otp should 5 Digit Max");
		}
	}
	
	
	public  static  boolean validateGrossaryType(String Type)throws CabException
	{
		if(Type.isEmpty()||!"".equals(Type))
		{
			return true;
		}
		else
		{
			throw new CabException("Cab type cannot be empty");
		}
	}
}
