package quickSort;
import java.util.*;
public class quickSort {
public int partition(int s[],int start, int end)
{
	int pivot = s[end];
	int i  = (start -1);
	for(int j = start; j<end;++j)
	{
		if(s[j]<=pivot)
		{
			i++;
			int temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			//swap(s[i],s[j]);
		}
	}
	int temp = s[i+1];
	s[i+1] = s[end];
	s[end] = temp;
	//swap(s[i+1],s[start]);
	return i+1;
}
//public void swap(int a, int b)
//{
//	int temp = a;
//	a=b;
//	b=temp;
//}
public void sort(int s[],int start, int end )
{
if(start<end)
{
int index = partition(s, start, end);
sort(s,start,index-1);
sort(s,index+1,end);
}
}
public static void display(int s[])
{
	int len = s.length;
	for(int i = 0; i<len; i++)
	{
		System.out.print(s[i]+"\t");
		
	}
}
public static void main(String[] args)
{
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter length of the array");
	int length = sc.nextInt();
	int s[] = new int[length];
	System.out.println("Enter elements");
	for(int a = 0; a<length; a++)
	{
		s[a] = sc.nextInt();
	}
	quickSort obj = new quickSort();
	obj.sort(s, 0, length-1);
	
	display(s);
}
}
