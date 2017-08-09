import java.util.Scanner;

public class EvenSum {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter lengh of array");
	n=sc.nextInt();
	int count = 0;
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int m = 0; m<arr.length ;m++)
	{
		for(int p=1; p<m;p++)
		{
			if((arr[m]+arr[p])%2==0)
			{
				
				count++;
				System.out.println(arr[m]+" "+arr[p]);
			}
			
		}
		
	}
	System.out.println("Occurance of such pairs: "+ count);
}
}
