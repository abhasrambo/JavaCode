package parenthesisMatch;
import java.util.*;
public class parmatcher {
	public void mismatch(String s)
	{
	int count = 0,change = 0;
	char[] arr = s.toCharArray();
	for(char all: arr)
	{
		switch (all)
		{
		case '(':
			count++;
			
		case ')':
			if(count==0)
			{
				change++;
				
			}
			else
				{
				
			    count--;
				}
			
		}
	}
	
	int edit = count+change;
	System.out.print(edit);
	}
	public static void main(String[] args)
	{
		String s = "()))))(";
		parmatcher obj = new parmatcher();
		obj.mismatch(s);
	}
}