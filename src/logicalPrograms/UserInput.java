package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the first value ");
        int number2 = sc.nextInt();
		int sum=number1+number2;
		System.out.println("Sum of the numbers "+sum);
		
		
	}

}
