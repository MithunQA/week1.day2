package week2.day2;

public class FindTypes {

	public static void main(String[] args) {

		String value = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArr = value.toCharArray();
		
		int charlength = charArr.length;
		
		for (int i = 0; i < charlength; i++) {
			
			char findtype = charArr[i];
			
			if(Character.isLetter(findtype)) {letter++;}
			else if(Character.isDigit(findtype)) {num++;}
			else if(Character.isSpaceChar(findtype)) {space++;}
			else
				specialChar++;
			
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);	
	}

}
