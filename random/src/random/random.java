package random;

import java.util.Random;

public class random {
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		Random rand = new Random(); 
		for(int i=0;i<10;i++)
		{
			arr[i]=rand.nextInt(100);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
