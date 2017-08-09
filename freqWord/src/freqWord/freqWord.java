package freqWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqWord {
	public static void count(String S)
	{
		String[] words = S.split(" ");
		 Map<String, Integer> map = new HashMap<>();
		    for (String w : words) {
		        Integer n = map.get(w);
		        n = (n == null) ? 1 : ++n;
		        map.put(w, n);
		    }
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		count(s);
	}
	}
