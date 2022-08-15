package logicalPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int fact = 1;
		
		for(int i=d;i>=fact;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of given " +d + " is "+fact);

	}
	

}
