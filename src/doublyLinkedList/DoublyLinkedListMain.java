package doublyLinkedList;

public class DoublyLinkedListMain {
	public static void main(String args[]) {
	DoublyLinkedList LinkedList = new DoublyLinkedList();
	LinkedList.insert(10);
	LinkedList.insert(15);
	Node node = new Node();
	node.data = 15;
	LinkedList.insertBefore(node, 35);
	
	LinkedList.printLinkedList();
	}
}
