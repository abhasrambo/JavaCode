package LinkedList;
class Node1{
    
    public int value;
    public Node1 link;
  
	public Node1() {
		this.link=null;
	}
	   
    
}

public class simpleSLLImpl {
	 
    private Node1 head;
    private Node1 tail;
     
    public void add(int element){
         
        Node1 nd = new Node1();
        nd.value=element;
        System.out.println("Adding: "+element);
        if(head == null)
          head = tail= nd;
        else 
        {
            tail.link=nd;
            tail = nd;
        }
    }
     
   
     
    public void delete(int ele){
        
        if(head.value == ele){
        System.out.println("Deleted: ");
        head=head.link;
        }
        else{
        	
        	Node1 tmp=head;
        	Node1 prev=head;
        	while(tmp.link!=null){
        		if(tmp.value == ele){
        			prev.link=tmp.link;
        			break;
        		}
        		else{
        			prev=tmp;
        			tmp=tmp.link;
        		}
        			
        	}
        }
    }
     
    public void traverse(){
         
        Node1 tmp = head;
        while(tmp!=null){
            System.out.println(tmp.value);
            tmp = tmp.link;
        }
    }
     
    public static void main(String a[]){
        simpleSLLImpl sl = new simpleSLLImpl();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        sl.add(76);
        System.out.println("array contents");
        sl.traverse();
        sl.delete(54);
        System.out.println("array contents");
        sl.traverse();
         
    }
}
 