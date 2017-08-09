package wordsInString;

import java.util.Scanner;

public class countWordsinString {
public static int count(String arr)
{
	int len = arr.length();
	int count =1;
	for(int i = 0; i<len; i++)
	{
		if(arr.charAt(i)==' ')
		{
			count++;
		}
		
	}
	return count;
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String s;
	s = sc.nextLine();
	
	int total;
	total = count(s);
	System.out.print(total);
}
}
