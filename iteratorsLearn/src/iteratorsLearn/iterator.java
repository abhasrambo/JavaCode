
package iteratorsLearn;
import java.util.*;
import java.util.ArrayList;

public class iterator {
public static void main(String[] args)
{
	ArrayList names = new ArrayList();
	names.add("xxx");
	names.add("abc");
	
	Iterator it = names.iterator();
	
	while(it.hasNext())
	{
		
		 String obj = (String)it.next();
	      System.out.println(obj);
	}
	Enumeration en = Collections.enumeration(names) ;
	while(en.hasMoreElements())
	{
		System.out.print(en.nextElement());
	}
}
}
