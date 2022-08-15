package logicalPrograms;

import java.util.Scanner;

public class ReverceAndOddNumber {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner (System.in);
      
      
      System.out.println("enter the number");
      int num = sc.nextInt();
      
      if(num%2==0)
      {
    	  System.out.println("given number is even");
    	  
      }else
      System.out.println("given number is odd");
	}

}
