package fourLetter;

public class fourLetter {
public int four(String s)
{
	int count = 0;
	String[] str = s.split(" ");
	for(String all : str)
	{
		char[] ch = all.toCharArray();
		if(ch.length==4)
		{
			count++;
		}
	}
	return count;
}
public static void main(String[] args)
{
	String s = "abha skum la la";
	fourLetter obj = new fourLetter();
	int i = obj.four(s);
	System.out.print(i);
}
}
