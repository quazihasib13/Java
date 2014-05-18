public class countLongestWordsInString 
{

	public static void main(String[] args) 
	{
		String[] toppings = { "Cheese", "Pepperoni", "Black Olives", "Sause" };

		int maxLength = 0;
		String longestString = null;
		
		for (String s : toppings) 
		{
			if (s.length() > maxLength) 
			{
				maxLength = s.length();
				longestString = s;
			}
		}
		int minLength = 0;
		String smallestString = null;
		for (String s : toppings)
		{
			if (s.length() < maxLength) 
			{
				minLength = s.length();
				smallestString = s;
			}
		}

		System.out.format("longest string: '%s'\n", longestString);
		System.out.format("smallest string: '%s'\n", smallestString);
		System.out.format("%d", maxLength);
		System.out.format("\n%d", minLength);
	}
}