package swap;

import java.util.Scanner;

class input {
	public void process(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swaped values are:" + a + b);
	}
}
public class swap{
	
	public static void main(String[] args){
		
		input obj = new input();
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		obj.process(a, b);
		int i=2;
		switch(i)
		{
		case 1:
			System.out.println("Swaped values are:1");
			break;
		case 2:
			if(i>=3)
			System.out.println("Swaped values are:2");
			break;
			default:
				System.out.println("Swaped values are:default");
		}
		
	}
}