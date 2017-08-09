package countBoolTrue;

import java.util.Scanner;

public class countTotalTrueBool {
	boolean atLeastTwo(boolean a, boolean b, boolean c) {
	    return a ? (b || c) : (b && c);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		boolean c = sc.nextBoolean();
		countTotalTrueBool obj = new countTotalTrueBool();
		boolean check = obj.atLeastTwo(a, b, c);
		if(check==true)
		{
			System.out.print("true");
		}
	}
}
