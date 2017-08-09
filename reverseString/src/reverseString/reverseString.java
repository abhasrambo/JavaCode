package reverseString;

import java.util.Scanner;

public class reverseString {
public static void reverse(String S)
{
	char[] str = S.toCharArray();
	int j=0;
	int len = str.length;
	char[] strNew = new char[len];
	for(int i = len-1; i>=0; i--)
	{
		
		strNew[j]=str[i];
		j++;
	}
	for(int m = 0; m<len; m++)
	{
		System.out.print(strNew[m]);
	}
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	reverse(s);
}
}
