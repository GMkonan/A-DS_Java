package doublyLinkedList;

public class DoublyLinkedListMain {
	public static void main(String args[]) {
	DoublyLinkedList LinkedList = new DoublyLinkedList();
	LinkedList.insertFirst(10);
	LinkedList.insertFirst(22);
	LinkedList.insertFirst(23);
	LinkedList.insertLast(31);
	LinkedList.insertLast(42);
	LinkedList.deleteFirst();
	LinkedList.deleteLast();
	
	Node after = new Node();
	after.data = 22;
	LinkedList.insertAfter(after, 12);
	
	LinkedList.insertLast(50);
	//22 12 10 31 50
	Node after2 = new Node();
	after2.data = 10;
	LinkedList.deleteAfter(after2);
	//null -> 22 -> 12 -> 10 -> 50 ->null
	
	System.out.println("Printing linked list forward:");
	LinkedList.printLinkedListF();
	
	System.out.println("Printing linked list backwards:");
	LinkedList.printLinkedListB();
	
	LinkedList.printListSize();
	}	
}
