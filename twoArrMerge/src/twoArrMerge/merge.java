package twoArrMerge;

import java.util.Scanner;

public class merge {
public static void main(String[] args)
{
	int[] a = new int[10];
	int[] b = new int[4];
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<6; i++)
	{
		a[i] = sc.nextInt();
	}
	for(int i = 0; i<4; i++)
	{
		b[i] = sc.nextInt();
	}
	int j = 0;
	for(int i =6; i<10;i++)
	{
		
		a[i]=b[j];
		j++;
	}
	
	for(int i = 0; i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	
	for( int i= 0;i<10-1;i++)
	{
		for( int k= i+1;k<10;k++)
		{
			if( a[i]>a[k])
				{
				int temp;
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
				
				}
		}
	}
	for(int i = 0; i<a.length;i++)
	{
		System.out.print(a[i]);
	}
}
}