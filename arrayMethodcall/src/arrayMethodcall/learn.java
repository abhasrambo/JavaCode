package arrayMethodcall;

import java.util.Scanner;

public class learn {
	public static void array(int[] a){
		int len = a.length;
		int i=0;
		while(i<len)
		{
			System.out.println(a[i]);
			i++;
		}
	}
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter len of arr");
		i=sc.nextInt();
		int[] arr = new int[i];
		System.out.println("Enyter elements");
		int j=0;
		while(j<i)
		{
			arr[j]=sc.nextInt();
			j++;
		}
		array(arr);
	}

}
