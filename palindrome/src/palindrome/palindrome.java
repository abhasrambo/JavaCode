package palindrome;

import java.util.Scanner;

public class palindrome {
	public static void reverse(String S)
	{
		char[] str = S.toCharArray();
		int j=0,k=1;
		int len = str.length;
		char[] strNew = new char[len];
		for(int i = len-1; i>=0; i--)
		{
			
			strNew[j]=str[i];
			j++;
		}
		for(int m = 0; m<len; m++)
		{
			if(str[m]==strNew[m])
			{
				k = 1;
			}
			else
				k = 0;
		}
		if(k==1)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		reverse(s);
	}
}
