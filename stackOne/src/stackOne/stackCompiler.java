package stackOne;

public class stackCompiler {
	int max;
	int top;
	String arr[];
	
public stackCompiler(int n)
{
	max = n;
	arr = new String[max];
	top = 0;
}
public boolean isEmpty()
{
	if(top == 0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void push(String s)
{
	if(top<max)
	{
		arr[top] = s;
		top++;
	}
	else
	{
		System.out.println("Stack Overflow");
	}
}
public String pop()
{
	if(!this.isEmpty())
	{
		String temp = this.peek();
		arr[top-1]=null;
		top--;
		return temp;
	}
	else
	{
		return null;
	}
}
public String peek()
{
	if(!this.isEmpty())
	{
		return arr[top-1];
	}
	else
	{
		return null;
	}
}
}
