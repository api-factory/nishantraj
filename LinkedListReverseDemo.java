package Assignment;

public class LinkedListReverseDemo {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	void  printSinglyLinkedList(Node node){
		
		while(null != node){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	 Node reverseSinglyLinkedList(Node node) { 
	        Node prev = null; 
	        Node current = node; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	        return node; 
	    } 
	
	 void getCount(Node node){
		 int size = 0;
		 
		 while(null != node){
			 size++;
			 node = node.next;
		 }
		 System.out.println("Linked list size : " + size);
	 }
	 
	public static void main(String []args){
		
		LinkedListReverseDemo list = new LinkedListReverseDemo();
		list.head = new Node(2);
		list.head.next = new Node(3);
		list.head.next.next = new Node(1);
		list.head.next.next.next = new Node(4);
		
		
		list.printSinglyLinkedList(head);
		head = list.reverseSinglyLinkedList(head);
		
		System.out.println("");
		list.printSinglyLinkedList(head);	
		
		System.out.println("");
		list.getCount(head);
	}
}
