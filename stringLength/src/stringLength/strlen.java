package stringLength;

public class strlen {
public int countdiff(String sOne, String sTwo)
{	
	char[] chOne = sOne.toCharArray();
	char[] chTwo = sTwo.toCharArray();
	int ascii = 0;
	for(int i = 0; i<chOne.length; i++)
	{
		
			if(chOne[i]!=chTwo[i])
			{
				ascii+= (int)chOne[i];
			}
		
	}
	for(int i = 0; i<chTwo.length; i++)
	{
		
			if(chTwo[i]!=chOne[i])
			{
				ascii+= (int)chTwo[i];
			}
		
	}
	return ascii;
	
}
public static void main(String[] args)
{
	String sOne = "at";
	String sTwo = "cat";
	strlen obj = new strlen();
	int diff = obj.countdiff(sOne, sTwo);
	System.out.print(diff);
}
}
