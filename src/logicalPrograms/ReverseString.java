package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		//Velocity
		//yticoleV
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value");
//		String s = sc.next();
//		
//		String r ="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			r=r+s.charAt(i);
//		}
//		System.out.println(r);
		
		String s="Velocity";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);

	}

}
