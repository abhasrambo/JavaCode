package compare2array;

import java.util.Scanner;

public class compare {
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of elements");

		    int n=sc.nextInt();
		   

			int[] a = new int[n];
			int[] b = new int[n];

		   

		    System.out.println("enter elements for first array");

		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();

		    }

		    System.out.println("enter elements for second array");
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();

		    }
			for (int all:a)
			{ int count=0;
				if(a[count]==b[count])
					System.out.print("Matched"+" "+"array:"+a[count]+count+1+"\n");
				count++;
			}
			
	}

}
