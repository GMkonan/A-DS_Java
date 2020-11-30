package singlyLinkedList;

class Node {
	//thats the value(data) that is inside the Node
	public int data;
	//Thats the pointer inside the Node, every Node
	//has a pointer that store the address of the next node
	//Here we call this pointers "next"
	public Node next;
	
	public void displayNodeData() {
		//maybe change to just data, or "value inside node = data"
		//I think like this maybe is confusing
		System.out.println("{ " + data +  " }");
	}
	
}

public class SinglyLinkedList {
	//This one is the first Node and it can have data or
	//not, search "dummy headers",is used for condition
	//Its private because we only need to reference head
	//inside this class
	private Node head;
	
}
