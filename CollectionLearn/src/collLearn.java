import java.util.*;
public class collLearn {
public static void main(String[] args)
{
	List arrL = new ArrayList();
	arrL.add("Test1");
	arrL.add("Test2");
	System.out.println(arrL);
	
	List LL = new LinkedList();
	LL.add("Test1");
	LL.add("Test2");
	System.out.println(LL);
	
	int count[] = {9,2,3,3,4,5};
	Set<Integer> set = new HashSet<Integer>();
	try{
		for(int i = 0; i<count.length ; i++)
		{
			set.add(count[i]);
		}
		System.out.println(set);
		TreeSet sortedSet = new TreeSet<Integer>(set);
		System.out.print(sortedSet);
	}
	catch(Exception e){
		System.out.print("Stupid err");
	}
	
}
}
