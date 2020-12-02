package singlyLinkedList;

public class LinkedListMain {
	public static void main(String args[]) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insert(1);
		linkedList.insert(8);
		linkedList.insert(5);
		//its gonna be 5 -> 8 -> 1
		
		linkedList.insertLast(3);
		//now its gonna be 5 -> 8 -> 1 -> 3
		Node node = new Node();
		node.data = 1;
		linkedList.insertAnyWhere(node, 10);
		// now its gonna be 5 -> 8 -> 1 -> 10 -> 3
		Node node2 = new Node();
		node2.data = 8;
		linkedList.deleteAfter(node2);
		// now its gonna be 5 -> 8 -> 10 -> 3
		linkedList.deleteFirst();
		//now its gonna be 8 -> 10 -> 3
		linkedList.insert(14);
		//now its gonna be 14 -> 8 -> 10 -> 3
		linkedList.insertLast(40);
		// now its gonna be 14 -> 8 -> 10 -> 3 -> 40
		linkedList.deleteFirst();
		//now its gonna be 8 -> 10 -> 3 -> 40
		linkedList.printLinkedList();
	}
}
