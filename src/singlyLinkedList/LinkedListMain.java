package singlyLinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertFirst(1);
		linkedList.insertFirst(8);
		linkedList.insertFirst(5);
		//its gonna be 5 -> 8 -> 1 -> NULL
		
		linkedList.insertLast(3);
		//now its gonna be 5 -> 8 -> 1 -> 3 -> NULL
		Node node = new Node();
		node.data = 1;
		linkedList.insertAfter(node, 10);
		// now its gonna be 5 -> 8 -> 1 -> 10 -> 3 -> NULL
		
		
		Node node2 = new Node();
		node2.data = 8;
		linkedList.deleteAfter(node2);
		// now its gonna be 5 -> 8 -> 10 -> 3 -> NULL
		linkedList.deleteFirst();
		//now its gonna be 8 -> 10 -> 3 -> NULL
		linkedList.insertFirst(14);
		//now its gonna be 14 -> 8 -> 10 -> 3 -> NULL
		linkedList.insertLast(40);
		// now its gonna be 14 -> 8 -> 10 -> 3 -> 40 -> NULL
		linkedList.deleteFirst();
		//now its gonna be 8 -> 10 -> 3 -> 40 -> NULL
		linkedList.insertLast(56);
		//now its gonna be 8 -> 10 -> 3 -> 40 -> 56 -> NULL
		linkedList.deleteLast();
		// now its gonna be 8 -> 10 -> 3 -> 40 -> NULL
		linkedList.printLinkedList();
	}
}
