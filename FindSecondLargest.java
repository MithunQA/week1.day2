package week2.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int arrlength = data.length;
		
		System.out.println("The second largest value is :  " + data[arrlength-2]);
	}

}
