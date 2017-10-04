package reverseSingleLinklist;

import java.util.Scanner;



public class singleLinklist {
	private static node head = null;
	private node tail = null;
	
	public void addElementstolinklist(int element)
	{
		
		node obj = new node();
		obj.data = element;
		if(head == null)
		{
			head = tail = obj;
		}
		else
		{
			while(tail.next!=null)
			tail = tail.next;
			
		}
		tail.next = obj;
		tail = tail.next;
		tail.next = null;
		
	}
	public void reverseLinklist()
	{	
		node prev = null;
		node current = null;
		node pointer = head;
		node next = null;
		if(head == null)
		{
			System.out.println("There are no elemets in the link list");
			
		}
		else
		{
			
			while(pointer != null)
			{
				current = pointer;
				pointer = pointer.next;
				current.next = prev;
				prev = current;
				head = current;
			}
			
	       
		}
		head = current;
			
	}
	public static void display()
	{
		node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		singleLinklist obj = new singleLinklist();
		
		
		System.out.println("Enter number of elements you want to enter");
		int number = sc.nextInt();
		System.out.println("Enter element");		
		for(int j = 0; j < number; j++)
		{
			int element = sc.nextInt();
			obj.addElementstolinklist(element);
		}
		obj.reverseLinklist();
		display();
	}
}
