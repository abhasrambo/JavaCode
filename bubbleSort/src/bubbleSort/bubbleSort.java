package bubbleSort;
import java.util.*;

class Calculate {
	private Scanner sc;

	public void sort()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] number = new int[size];
		for (int i = 0; i<size; i++)
		{
			number[i]=sc.nextInt();
		}
		for( int i= 0;i<size;i++)
		{
			for( int j= 0;j<size;j++)
			{
				if( number[i]<number[j])
					{
					int temp;
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					
					}
			}
		}
		System.out.print("Sorted array is:\n");
		for (int i = 0; i<size; i++)
		{
			System.out.print(number[i]+"\n");
		}
		
	}
		
}
public class bubbleSort{
	public static void main(String[] args)
	{
		Calculate obj = new Calculate();
		obj.sort();
		
		
	}
	
}
