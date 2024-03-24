
class Node{
	int data;
	Node next;
	Node(){
		data=0;
		next=null;
	}
	Node(int data){
		this.data=data;
		next=null;
	}
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
}
class Llst{
	Node head;
	int size;
	Llst(Node head){
		this.head=head;
		size=1;
	}
	void getsiz() {
		System.out.println(size);
	}
	void addfirst(int a) {
		if(head==null) {
			head=new Node(a);
			return;
		}
		else {
			Node ref=new Node();
			ref.next=head;
			ref.data=a;
			head=ref;
		}
		size++;
		
	}
	void addlast(int a) {
		if(head==null) {
			head=new Node(a);
			return;
		}
		else {
			Node ref=head;
			while(ref.next!=null) {
				ref=ref.next;
			}
			ref.next=new Node(a);
		}
		size++;
	}
	void addin(int data,int index) {
		if(index<0 || index>size) {
			System.out.println("invalid index");
		}
		else if(index==size)
			addlast(data);
		else if(index==0)
			addfirst(data);
		else {
			Node ref=head;
			for(int i=0;i<index-1;i++) {
				ref=ref.next;
			}
			Node temp=ref.next;
			ref.next=new Node(data,temp);
			
			
		}
		size++;
		
	}
	void disp() {
		Node ref=head;
		while(ref.next!=null) {
			System.out.print(ref.data+" ");
			ref = ref.next;
		}
		System.out.println(ref.data);
		return;
	}
	void deltfirst() {
		if(head==null) {
			System.out.println("no data to delete");
			return;
		}
		else {
			Node ref=head;
			ref=ref.next;
			head.next=null;
			head=ref;
			
		}
		size--;
	}
	void deltlast() {
		if(head==null) {
			System.out.println("no data to delete");
			return;
		}
		else {
			Node ref=head;
			for(int i=1;i<size-1;i++)
				ref=ref.next;
			ref.next=null;
			
		}
		size--;
	}
	void deleAtIn(int n) {
		if(head==null) {
			System.out.println("no data to delete");
			return;
		}
		else {
			Node ref=head;
			for(int i=0;i<n-2;i++)
				ref=ref.next;
			Node ne=ref.next;
			ref.next=ne.next;
			ne.next=null;
			
			
		}
		size--;
	}
	void palindrome() {
		if(head==null) {
			System.out.println("no data");
		return;
		}
		else if(size==1) {
			System.out.println("yes it is a palindrom");
			return;
		}
		int n=size/2;
		Node ref=head;
		for(int i=0;i<n-1;i++) {
			ref=ref.next;
		}
		Node sec=ref.next;
		if(size%2==1)
			sec=sec.next;
		ref.next=null;
		Node fun=head;
		reversewi(fun);
		for(int j=0;j<n;j++) {
			if(head.data==sec.data){
				System.out.println(sec.data);
				System.out.println(sec.data);
				head=head.next;
				sec=sec.next;
			}
			else {
				System.out.println("no its not a palindrome");
				
				return;
			}
			
			
		}
		System.out.println("yes it is palindrome");
		return;
		
		
		
	}

	void rotateclk(int n) {
		if(head==null) {
			System.out.println("no data");
			return;
		}
		Node ref=head;
		Node newhead=head;
		for(int i=0;i<size-1;i++) {
			ref=ref.next;
			if(i<size-1-n)
				newhead=newhead.next;
			
		}
		ref.next=head;
		head=newhead.next;
		newhead.next=null;
	}
	
	
	void rotateanti(int n) {
		if(head==null) {
			System.out.println("no data");
			return;
		}
		Node ref=head;
		Node newhead=head;
		for(int i=0;i<size-1;i++) {
			ref=ref.next;
			if(i<n-1)
				newhead=newhead.next;
			
		}
		ref.next=head;
		head=newhead.next;
		newhead.next=null;
		
	}
	void reverse() {
		if(head==null) {
			System.out.println("no data");
		}
		else {
			Node prev=null;
			Node ref=head;
			Node next=null;
			while(ref!=null) {
				next=ref.next;
				ref.next=prev;
				prev=ref;
				ref=next;
			}
			head=prev;
			
			
		}
			
	}
	void reversewi(Node headin) {
		if(head==null) {
			System.out.println("no data");
		}
		else {
			Node prev=null;
			Node ref=headin;
			Node next=null;
			while(ref!=null) {
				next=ref.next;
				ref.next=prev;
				prev=ref;
				ref=next;
			}
			head=prev;
			
			
		}
			
	}
	void reverseArr() {
	if(head==null) {
		System.out.println("no data");
	}
	else {
		int[] ar=new int[size];
		int i=0;
		Node ref=head;
		while(ref!=null) {
			ar[i++]=ref.data;
			ref=ref.next;
		}
		Node ref1=head;
		for(int j=size-1;j>=0;j--) {
			ref1.data=ar[j];
			ref1=ref1.next;
		}
	}
}
}


public class  SinglyL{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=new Node(1);
		Llst l=new Llst(n);
		l.addfirst(2);
		l.addfirst(3);
		
		l.addlast(1);
		l.addlast(2);
		l.addlast(3);
		
		l.disp();
//		l.addfirst(1);
//		l.addin(10,3);
//		l.disp();
//		l.deltfirst();
//		l.disp();
//		l.getsiz();
//		l.deltlast();
//		l.disp();
//		l.getsiz();
//		l.rotateclk(3);
//		l.disp();
//		l.getsiz();
//		l.rotateanti(3);
//		l.disp();
//		l.getsiz();
//		l.reverseArr();
//		l.disp();
//		l.getsiz();
//		l.palindrome();
//		l.deleAtIn(2) ;
		l.disp();
		l.palindrome();//head value is not retained

	}

}