package circusProblem;

import java.util.Scanner;

public class mainClass {
public static void main(String[] args)
{
	circusSort obj = new circusSort();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total number of participant");
	int numberOfPeople = sc.nextInt();
	int[] weight = new int[numberOfPeople];
	int[] height = new int[numberOfPeople];
	System.out.println("Please enter height and weight each seperated by enter");
	for(int i = 0; i<numberOfPeople; i++)
	{
		height[i] = sc.nextInt();
		weight[i] = sc.nextInt();
	}
	obj.sort(height, weight);
}
}
