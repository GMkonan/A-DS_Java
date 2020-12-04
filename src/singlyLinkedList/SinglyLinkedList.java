package singlyLinkedList;

class Node {
	//thats the value(data) that is inside the Node
	public int data;
	//Thats the pointer inside the Node, every Node
	//has a pointer that store the address of the next node
	//Here we call this pointers "next"
	public Node next;
	
	public void displayNodeData() {
		System.out.print( data +  " -> ");
	}
	
}

public class SinglyLinkedList {
	//Its private because we only need to reference head
	//inside this class
	private Node head; //here head == null
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
	}
    
	public void deleteFirst() {
		//shifts the first node (head) to be where 
		//it was pointing (second node)
		head = head.next;
	}
    
	public void insertLast(int data) {
		Node current = head; //start from the first node
		//loop until current == null because you are looping
		//all the nodes until you find the end (null)
		while(current.next != null) {
			current = current.next;
		}
		//insert the newNode next to current
		//which now is the final node
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
    
	public void deleteLast() {
		Node current = head;
		Node temp = head;
		while (current.next != null) {
			temp = current;
			current = current.next;
		}
		current = temp;
		current.next = null;
	}
    
	public void insertAfter(Node after,int data) {
		Node current = head;
		Node temp = head;
		while (temp.data != after.data ) {
			temp = current;
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		temp.next = newNode;
		newNode.next = current;
	}
    
	public void deleteAfter(Node after) {
		Node current = head; 
		while (current.data != after.data) {
			current = current.next;
		}
		current.next = current.next.next;
	}
    
	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
			
		}
		System.out.print("NULL");

	}
}
