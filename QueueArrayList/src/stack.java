import java.util.*;
import java.util.Scanner;
public class stack<E> {
public ArrayList<E> list;

public stack()
{
	list = new ArrayList<E>();
}

public void push(E e)
{
	list.add(e);
}
public boolean isEmpty() {
		return (list.size() == 0);
	}
public E pop(){
	if(!isEmpty())
	{ 
		return list.remove(list.size() -1);
	}
	else
	{
		return null;
	}
}
public E peek(){
	if(!isEmpty())
	{
		return list.get(list.size()-1);
	}
	else
	{
		return null;
	}
	
}
public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();
	  stack obj = new stack();
	  obj.push("5");
	  obj.push("6");
	  obj.push("7");
	  obj.push("8");
	  String a = (String) obj.peek();
	  System.out.print(a);
	  obj.pop();
 
	  }  
	}

