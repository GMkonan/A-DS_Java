package doublyLinkedList;

class Node {
	public int data;
	public Node next;
	public Node previous;
	
	public void displayF() {
		System.out.print(data + " -> ");
	}
	public void displayB() {
		System.out.print(" <- " + data);
	}
}

public class DoublyLinkedList {
	
	private Node head = null;
	private Node tail;
	private int listSize;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		//make newNode point to the address head have
		newNode.next = head;
		//make newNode point previous to null
		newNode.previous = null;
		if(head != null) {
			//make newNode be before the head
			head.previous = newNode;
		}
		//make newNode the new head
		head = newNode;
		
		if (tail == null) {
			tail = newNode;
		}
		listSize++;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.previous = tail;
		if (tail != null) {
			tail.next = newNode;
		}
		tail = newNode;
		if (head == null) {
			head = newNode;
		}
		listSize++;
	}
	
	public void deleteFirst() {
		if (listSize > 0) {
		head = head.next;
		head.previous = null;
		listSize--;
		}
		else {
			System.out.println("The list is empty!");
		}
	}
	
	public void deleteLast() {
		tail = tail.previous;
		tail.next = null;
		listSize--;
	}
	
	public void insertAfter(Node after, int data) {
		Node current = head;
		Node temp = head;
		while(current.data != after.data) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		temp = current.next;
		current.next = newNode;
		newNode.next = temp;
		newNode.previous = current;
		temp.previous = newNode;
		listSize++;
	}
	//Delete before?
	public void deleteAfter(Node after) {
		Node current = head;
		Node temp = head;
		while(current.data != after.data) {
			current = current.next;
		}
		temp = current.next.next;
		current.next = current.next.next;
		temp.previous = current;
		listSize--;
	}
	
	public void printLinkedListF() {
		System.out.print("NULL -> ");
		Node current = head;
		while (current != null) {
			current.displayF();
			current = current.next;
		
		}
		System.out.println("NULL");
		//System.out.println();
	}
	
	public void printLinkedListB() {
		System.out.print("NULL");
		Node current = tail;
		while (current != null) {
			current.displayB();
			current = current.previous;
		}
		System.out.println(" <- NULL");
	}
	
	public void printListSize() {
		System.out.println("List size:" + listSize);
	}
	
}
