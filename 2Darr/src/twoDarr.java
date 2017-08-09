import java.util.Scanner;

public class twoDarr {
public static void main(String[] args)
{
	int a, b;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	int[][] arr2D = new int[a][b];
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{
			arr2D[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{
			System.out.print(arr2D[i][j]);
		}
	}
}
}
