package logicalPrograms;

public class WhiteSpaceFromString {

	public static void main(String[] args) 
	{
           //we have to find white space in string
		
        String s = "I Love My India";
        int counter = 0;
        for(int i=0;i<=s.length()-1;i++)
        {
        	char blank = s.charAt(i);
        	if(blank==' ')
        	{  
        		counter++;
        	}
        	System.out.println("Number of blanck space in "+s+ "is "+counter);
        }
	}

}
