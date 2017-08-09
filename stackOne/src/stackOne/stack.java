package stackOne;
import java.util.*;
public class stack {
	//private static Scanner sc;
	private static stackCompiler obj;
	public static void output(){
		System.out.println("Enter your choice of operation:\n1) pop\n2)peek\n");
		Scanner sc = new Scanner(System.in);
		int controller =sc.nextInt();
		switch(controller)
		{
		case 1:System.out.println(obj.pop());
		output();
			break;
		case 2:System.out.println(obj.peek());
		output();
			break;
			default:
				System.exit(0);
	}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
	int noOfElements = sc.nextInt();
	obj = new stackCompiler(noOfElements);
	String s;
	System.out.println("Enter elements in stack");
	for(int i = 0; i<noOfElements; i++)
	{
		s = sc.nextLine();
		obj.push(s);
	}
	output();
//	System.out.println("Enter your choice of operation:\n1) pop\n2)peek\n");
//		int controller =sc.nextInt();
//		
//		switch(controller)
//		{
//		case 1:System.out.println(obj.pop());
//			break;
//		case 2:System.out.println(obj.peek());
//			break;
//			default:
//				System.exit(0);
//		}
	}
}

	
