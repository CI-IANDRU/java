
	class LinkedList {
		 
	    static Node head;
	 
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	 
	    /* Function to reverse the linked list */
	    void reverse()
	    {
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        while(current!=null){
	            next=current.next;
	            current.next=prev;
	            prev=current;
	            current=next;
	            
	        }
	        head=prev;
	      
	    }
	 
	    // prints content of double linked list
	    void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	        System.out.println();
	    }
	     public static void main(String[] args)
	    {
	        LinkedList list = new LinkedList();
	        list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);
	 
	        System.out.println("Given linked list");
	        list.printList(head);
	        list.reverse();
	        list.printList(head);
	    }
	}
