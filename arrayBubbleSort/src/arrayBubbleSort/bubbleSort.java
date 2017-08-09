package arrayBubbleSort;
import java.util.*;


	

	class Calculate {
		private Scanner sc;

		public int[] sort(int[] number)
		{
			
			int size = number.length;
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
			return number;
			
			
		}
			
	}
	public class bubbleSort{
		public static void main(String[] args)
		{
			int i;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			int[] number = new int[size];
			int[] numberOne = new int[size];
			for (int i1 = 0; i1<size; i1++)
			{
				number[i1]=sc.nextInt();
			}
			Calculate obj = new Calculate();
			numberOne = obj.sort(number);
			System.out.print("Sorted array is:\n");
			for (int i1 = 0; i1<size; i1++)
			{
				System.out.print(number[i1]+"\n");
			}
			
			
		}
		
	}


