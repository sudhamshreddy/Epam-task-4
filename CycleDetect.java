import java.util.*;
class CycleDetect{
	public static void main(String[] args) {
	 Linkedlist llist = new Linkedlist(); 
  
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
        llist.head.next.next.next.next = llist.head; 
        llist.detectCycle(); 
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
class Linkedlist{
	Node head;
	void push(int data){
	Node newNode=new Node(data);
	newNode.next=head;
	head=newNode;
	}
	void detectCycle(){
		Node slow=head,fast=head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				System.out.println("Cycle Detected");
				return;
			}
		}
	}
}