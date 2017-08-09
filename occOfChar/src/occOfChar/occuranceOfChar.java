package occOfChar;

import java.util.*;

public class occuranceOfChar {
public static void count(String S)
{
	HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
	char[] str = S.toCharArray();
	for(char all:str)
	{
		if(hashmap.containsKey(all))
		{
			hashmap.put(all, hashmap.get(all)+1);
		}
		else
		{
			hashmap.put(all, 1);
		}
	}
	System.out.println(hashmap);
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	count(s);
}
}
