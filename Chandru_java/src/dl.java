
class Dnode{
	Dnode pre;
	int data;
	Dnode nxt;
	Dnode(){
		this.pre=null;
		this.data=0;
		this.nxt=null;
	}
	Dnode(int n){
		this.pre=null;
		this.data=n;
		this.nxt=null;
	}
	Dnode(Dnode pre,int n,Dnode nxt){
		this.pre=pre;
		this.data=n;
		this.nxt=nxt;
	}
}
class Dlist{
	Dnode head;
	Dnode tail;
	int size;
	Dlist(Dnode Dnode){
		this.head=Dnode;
		this.tail=Dnode;
		size++;
	}
	void getsiz() {
		System.out.println("size:"+size);
	}
	void addfirst(int n) {
		if(head==null) {
			head=new Dnode(n);
		}
		else {
			Dnode ref=new Dnode(n);
			ref.nxt=head;
			head.pre=ref;
			head=ref;
			
		}
		size++;
	}
	void addlast(int n) {
		if(head==null) {
			head=new Dnode(n);
		}
		else {
			Dnode ref=new Dnode(n);
			tail.nxt=ref;
			ref.pre=tail;
			tail=ref;
			}
		size++;
		
	}
	void addin(int index,int n) {
		if(index>size || index<0) {
			System.out.println("enter valid index");
			return;
		}
		else if(index==size) {
			addlast(n);
		}
		else if(index==0) {
			addfirst(n);
		}
		else {
			Dnode ref=new Dnode(n);
			Dnode ite=head;
			for(int i=0;i<index-1;i++) {
				ite=ite.nxt;
			}
			Dnode save=ite.nxt;
			ite.nxt=ref;
			ref.pre=ite;
			ref.nxt=save;
			save.pre=ref;
			size++;
		}
	}
	void delfirst() {
		if(head==null) {
			System.out.println("No data to delete");
			return;
		}
		else {
			head=head.nxt;
			head.pre=null;
			
		}
		size--;
	}
	void dellast(){
		if(head==null) {
			System.out.println("No data to delete");
			return;
		}
		else {
			Dnode ref=tail;
			tail=tail.pre;
			ref.pre=null;
		}
		size--;
		
	}
	void delin(int index) {
		if(head==null) {
			System.out.println("No data to delete");
			return;
		}
		else if(index<0 && index>=size) {
			System.out.println("enter a valid index");
		}
		else if(index==0) {
			delfirst();
			return;
		}
		else if(index==size-1) {
			dellast();
			return;
		}
		else {
			Dnode ref=head;
			for(int i=0;i<index-1;i++) {
				ref=ref.nxt;
			}
			Dnode tdel=ref.nxt;
			ref.nxt=tdel.nxt;
			tdel.nxt.pre=ref;
			tdel.nxt=null;
			tdel.pre=null;
		}
			
		size--;
		
	}
	void delele(int datatodelt) {
		
	}
	void dispd() {
		Dnode ref=head;
		while(ref!=tail) {
			System.out.print(ref.data+" ");
			ref=ref.nxt;
		}
		System.out.print(ref.data);
		
		System.out.println();
	}
	void disprev(){
		Dnode ref=tail;
		while(ref!=head) {
			System.out.print(ref.data+" ");
			ref=ref.pre;
		}
        System.out.print(ref.data);
		
		System.out.println();
	}
	
}
public class dl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dnode d1=new Dnode(2);
		Dlist dll=new Dlist(d1);
		dll.dispd();
		dll.addlast(4);
		dll.addfirst(1);
		dll.dispd();
		dll.addin(2,3);
		dll.addin(4,5);
		dll.dispd();
		dll.delfirst();
		dll.dispd();
		dll.dellast();
		dll.dispd();
		dll.delin(2);
		dll.getsiz();
		dll.dispd();
		dll.addlast(4);
		dll.addfirst(1);
		dll.dispd();
		dll.disprev();
		
		
		
		

	}

}