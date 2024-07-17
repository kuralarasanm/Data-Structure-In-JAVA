package DataStructureOnline;


class Node{
	
	int data;// default 0
	Node next;// default null
	public Node(int data) {
		this.data=data;
	}
	
}
class LinkedList{
	Node head,tail;
	public void insert(int data) {
		Node n=new Node(data);
		
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void insertBeg(int data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	public void insertAt(int pos,int data) {
		Node n=new Node(data);
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
			n.next=temp.next;
			temp.next=n;
		}
	}
	public void deleteBeg() {
		Node temp=head;
		head =head.next;
		temp.next=null;
		//or
//		head =head.next;
	}
	public void deleteEnd() {
		Node temp=head;
		while(temp.next!=tail) {
			temp =temp.next;
		}
			temp.next=null;
			tail=temp;
	}
	public void deleteAt(int pos) {
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
}
public class SingleLinkedList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insertBeg(50);//beginning
		l.insertAt(2, 15);
		l.display();
		System.out.println("after delete begin");
		l.deleteBeg();
		l.display();
		System.out.println("after delete end");
		l.deleteEnd();
		l.display();
		System.out.println("after delete postion");
		l.deleteAt(2);
		l.display();
	}
}
