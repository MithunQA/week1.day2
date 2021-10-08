package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		
		String text2 = "potss";
		
		int textlength1 = text1.length();
		
		int textlength2 = text2.length();
		
		if (textlength1 == textlength2)
		{
			
			char[] charArr1 = text1.toCharArray();
 			
			char[] charArr2 = text2.toCharArray();
			
			Arrays.sort(charArr1);
			
			Arrays.sort(charArr2);
			
			if(Arrays.equals(charArr1, charArr2))
			{
				System.out.println("Has same value");
			}
			else
				System.out.println("Has different value");
		}
		
	}

}
