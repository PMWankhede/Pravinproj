package logicalPrograms;

public class ReverceTheNumber {

	public static void main(String[] args) 
	{
		//find the reverce number 
		//567845--->548765
		
//		int num1 = 567845;
//		String s = Integer.toString(num1);
//		String r ="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			r=r+s.charAt(i);
//		}
//		System.out.println("Orizinal number "+num1);
//		System.out.println("Reverce number "+r);
		
		int num1 = 567845;
		String s = Integer.toString(num1);
		String r ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		int revnum = Integer.parseInt(r);
		System.out.println("Orizinal number "+num1);
		System.out.println("Reverce number "+revnum);
thub
	}

}
