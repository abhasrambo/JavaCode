import java.util.Scanner;

public class calc {
	public static int add(int a, int b)
	{
		int sum;
		sum = a+b;
		return sum;
	}
	public static int add(int a, int b,int c)
	{
		int sum;
		sum = a+b+c;
		return sum;
	}
	
	public  static int sub(int a, int b)
	{
		int minus;
		minus = a-b;
		return minus;
	}
	public static int div(int a, int b)
	{
		int divi;
		divi = a/b;
		return divi;
	}
	public static int mult(int a, int b)
	{
		int prod;
		prod = a*b;
		return prod;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sumOfNumbers = add(a, b);
		int subOfNumbers = sub(a,b);
		int divOfNumbers = div(a, b);
		int prodOfNumbers = mult(a,b);
		int sumOfNumbers3 = add(a, b, c);
		System.out.print(sumOfNumbers+" "+ sumOfNumbers3+" "+subOfNumbers+ " "+divOfNumbers+" "+prodOfNumbers);
	}

}
