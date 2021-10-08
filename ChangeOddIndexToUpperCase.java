package week2.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String value = "changeme";
		
		StringBuffer finalString = new StringBuffer();
		
		char[] charArr = value.toCharArray();
		
		int charLength = charArr.length;
		
		for (int i = 0; i < charLength; i++) {
			
			char name = charArr[i];
			
			if (i % 2 != 0) 
			{ 
				
				name = Character.toUpperCase(name);
				
			}
			
			finalString.append(name);
		}
		
		System.out.println(finalString.toString());
	}

}
