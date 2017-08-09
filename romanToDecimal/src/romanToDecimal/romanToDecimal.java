package romanToDecimal;

import java.util.Scanner;

public class romanToDecimal {
	public static void main(String[] args)
	{ 		
			int count,sum;
			int i = 0;
			int a = 1, b = 5, c =10;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Length of roman string");
			i = s.nextInt();
			char[] roman = new char[i];
			System.out.println("Enter a roman number");
			for (count = 0; count < i ; count++)
			{
				roman[count] = s.next().charAt(0);
				
			}
			
			//System.out.println(roman);
			if (roman[0]==('X') && roman[1]==('I'))
			{
				sum = c+a+b;
			}
			else if (roman[0]==('V') && roman[1]==('I'))
			{
				sum = b+a+c;
				
			}
			else if (roman[1]==('V') && roman[0]==('I'))
			{
				sum = b-a+c;
			}
			else
				sum = c-a+b;
					
			System.out.println(sum);
	}
}
