package linkList;
import java.util.*;

public class linkList {
	private static node head;
	private node tail;
	public void addAtTail(String element)
	{
		node obj =new node();
		obj.data = element;
		if(head == null){
			head = tail = obj;
		}
		else{
			tail.next = obj;
			tail = obj;
		}

		
	}
	public void addAtPosition(String element,int position)
	{
			int length = size();
			node obj =new node();
			obj.data = element;
			if(position>length)
			{
				System.out.println("Out Of Index\n please enter again carefully");
				System.exit(0);
				
			}
			else{
			
			
				node temp = head;
				node tempNext = temp;
				int count = 0;
				while(count<=position-2)
				{
					temp = temp.next;
					tempNext = temp.next;
					count++;
				}
				temp.next = obj;
				obj.next = tempNext;
			
			}
			
	}
	public int size() {
		   int size = 0;
		   for(node n = head; n.next != null; n = n.next)
		       size++;     
		   return size;
		}
	public void deleteNodeByPosition(int position)
	{
		node temp = head;
		node tempNext = temp;
		node tempPrev = head;
		if(head == null)
		{
			System.out.println("Empty Link List");
		}
		else
		{
			int count = 0;
			while(count<=position-1)
			{
				tempPrev = temp;
				temp = temp.next;
				tempNext = temp.next;
				count++;
			}
			tempPrev.next = tempNext;
			System.gc();
		}
		
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
		linkList obj = new linkList();
		System.out.println("For display Press 1,\n add elements at end Press 2,\n add element at position which is less than or equal to length of Link List Press 3,\n delete 4,\n anything to exit");
		int i;
		i = sc.nextInt();
		switch(i)
		{
		case 1:
			display();
			
		case 2:
			System.out.println("Enter number of elements you want to enter");
			int number = sc.nextInt();
			System.out.println("Enter element");
			
			for(int j = 0; j <= number; j++)
			{
				String element = sc.nextLine();
				obj.addAtTail(element);
			}
			display();
			
		case 3:
			display();
			System.out.println(obj.size());
			System.out.println("Enter element");
			String elementAtPosition = sc.nextLine();
			System.out.println(elementAtPosition);
			int position = sc.nextInt();
			obj.addAtPosition(elementAtPosition, position);
			display();
			
		case 4:
			System.out.println("Enter position to be deleted");
			int deletionPosition;
			deletionPosition = sc.nextInt();
			obj.deleteNodeByPosition(deletionPosition);
			display();
		default:
			System.exit(0);
		}
	}
}
