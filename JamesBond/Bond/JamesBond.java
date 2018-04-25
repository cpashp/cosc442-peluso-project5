package Bond;

public class JamesBond {

	
	public Boolean bondRegex(String input)
	{
		Boolean result = false;
		
		if (input.matches("[0123456789)]*\\({1}[0123456789()]*0{1}0{1}7{1}[0123456789(]*\\){1}[0123456789()]*"))
		{
			result = true;
		}
		return result;
	}
}
