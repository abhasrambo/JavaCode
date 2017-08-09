package arrOdd;

import java.util.Scanner;

public class arrOdd {
	private static Scanner sc;

	public static void main(String[] args)
	{
		int a ;
		sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements\n");
		a = sc.nextInt();
		int[] arr = new int[a];
		System.out.print("Enter Elements\n");
		for(int i = 0; i < a; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Odd elements are :\n");
		for(int j=0;j<a;j++)
		{
			if(arr[j]%2 != 0)
			{
				System.out.println(arr[j]);
			}
		}
		
		
	}

}
