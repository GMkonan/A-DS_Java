package doublyLinkedList;

class Node {
	public int data;
	public Node next;
	public Node previous;
	
	public void display() {
		System.out.println(data);
	}
}

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	public void insert(int data) {
		Node newNode = new Node();
		 newNode.data = data;
		 newNode.next = head;
		 head = newNode;
	}
	
	public void insertBefore(Node bef ,int data) {
		Node current = head;
		while(current.data != bef.data) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		
		newNode.previous = bef;
		newNode.next = current.next;
		newNode = current;
	}
	
	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		
		}
		
	}
	
}
