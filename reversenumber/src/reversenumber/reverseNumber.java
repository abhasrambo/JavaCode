package reversenumber;

import java.util.Scanner;

class reverseNumber {
	public void reverse(int a)
	{int numRev = 0;
		while(a!=0)
			{
				numRev = numRev*10;
				numRev = numRev + a%10;
				a = a/10;
				
			}
		System.out.println(numRev);
	}

}

class print{
	public static void main(String[] args)
	{
		int number;
		int rev;
		reverseNumber obj = new reverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		number = sc.nextInt();
		obj.reverse(number);
	}
}