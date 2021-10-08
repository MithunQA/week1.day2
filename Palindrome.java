package week2.day2;

public class Palindrome {

	public static void main(String[] args) {

		String value = "madam";
		
		String revValue = "" ;
		
		int strlength = value.length();
		
		for(int i = (strlength - 1); i >= 0 ; i--)
		{
			revValue = revValue + value.charAt(i);
		}
		
		if(value.equalsIgnoreCase(revValue))
		{
			System.out.println(revValue + " is Palindrome");
		}
		else
			System.out.println(revValue + " is not Palindrome");
		
		
	}

}
