package logicalPrograms;

public class ArmStringNumber {

	public static void main(String[] args) 
	{   
		//153==1^3+5^3;1^3=>1+125+27=>153
		
		int num = 153;
		int sum = 0 ;
		
		for(int i = num;i>0;i=i/10)
		{
			int rem= i%10;
			sum=sum+(rem*rem*rem);
		}
		if(num==sum)
		{
			System.out.println("given number is armstrong number");
		}else
		{
			System.out.println("given number is not armstrong number");
		}
	}

}
