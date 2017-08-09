package pattern;

import java.util.Scanner;

public class pattern {
public static void main(String[] args)
{
	int i,j;
	System.out.println("Enter a number to design pattern/n");
	Scanner sc = new Scanner(System.in);
	i = sc.nextInt();
	for(int k=1;k<=i;k++)
	{
		for(j=1;j<=k;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	for(int k=i-1;k>0;k--)
	{
		for(j=1;j<=k;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
}
