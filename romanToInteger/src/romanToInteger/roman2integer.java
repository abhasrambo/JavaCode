package romanToInteger;
import java.util.*;

class convert {
	public int romanToInt(String s){
		
		if(s == null || s.length() == 0)
			return 0;
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);
		
		int num = 0;
		for(int i = 0; i< s.length();i++)
		{if(i <= s.length() - 2 && hashMap.get(s.charAt(i))<hashMap.get(s.charAt(i+1)))
			num = num - hashMap.get(s.charAt(i));
		else
			num = num + hashMap.get(s.charAt(i));
			}
		return num;
		
	}

}

public class roman2integer{
	public static void main(String[] args)
	{
		convert obj = new convert();
		Scanner sc = new Scanner(System.in);
		String roman = sc.nextLine();
		int integer;
		integer = obj.romanToInt(roman);
		System.out.println(integer);
	}
}
