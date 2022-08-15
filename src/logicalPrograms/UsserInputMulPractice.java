package logicalPrograms;

import java.util.Scanner;

public class UsserInputMulPractice {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second value");

		int num = sc.nextInt();
		
        int mul = num1*num;		
        System.out.println("Multiplication of number "+mul);

	}

}
