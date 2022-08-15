package logicalPrograms;

import java.util.Scanner;

public class PrimeNumberWithScanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int d = sc.nextInt();
		int counter = 0;
		
		for(int i=2;i<d;i++)
		{
			if(d%i==0)
			{
				counter++;
				break;
			}
		}
			if(counter==1)
			{
				System.out.println("Given number is not prime");

			}else {
			System.out.println("Given number is a prime");
			}
		}

	}


