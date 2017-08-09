package numToChar;
import java.util.*;
public class numToChar {
public static void convert(int[] arr)
{
	String[] s=new String[4];
	HashMap<Integer, String> hashmap = new HashMap<Integer, String >();
	hashmap.put(1, "one");
	hashmap.put(2, "Two");
	hashmap.put(3, "Three");
	hashmap.put(4, "Four");
	hashmap.put(5, "Five");
	hashmap.put(6, "Six");
	hashmap.put(7, "Seven");
	hashmap.put(8, "Eight");
	hashmap.put(9, "Nine");
	hashmap.put(0, "Zero");
	
	for(int i = 0; i< arr.length;i++)
	{
		s[i]=hashmap.get(arr[i]);
	}
	for(int j = 0;j<4;j++)
	{
	System.out.println(s[j]);
	}
	
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n[] = new int[4];
	for(int i = 0; i<4;i++)
	{
		n[i] = sc.nextInt();
	}
	convert(n);
}
}
