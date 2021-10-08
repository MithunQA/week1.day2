package week2.day2;

public class Calculator {

	int num1 = 1;
	int num2 = 2;
	int num3 = 3;	
	int sum;
	int diff;
	int mul;
	int div;
	
	public void add()
	{
		sum = num1+num2;
		System.out.println(sum);
		
	}
	
	public void Sub()
	{
		diff = num2-num1;
		System.out.println(diff);
		
	}
	
	public void multiple()
	{
		mul = num2*num3;
		System.out.println(mul);
	}
	
	public void divide()
	{
		div = num3%num1;
		System.out.println(div);
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
