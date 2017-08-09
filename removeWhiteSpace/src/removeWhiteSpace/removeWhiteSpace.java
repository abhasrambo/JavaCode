package removeWhiteSpace;
import java.util.*;
public class removeWhiteSpace {
public static void str(String s)
{
	int len = s.length();

	s=s.replaceAll("\\s+","");
System.out.println(s);
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String s;
	s = sc.nextLine();
	str(s);
}
}
