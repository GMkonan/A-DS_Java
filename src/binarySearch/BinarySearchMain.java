package binarySearch;

public class BinarySearchMain {
	public static void main(String args[]) {
		BinarySearch binary = new BinarySearch();
		int[] arr = {10, 6, 4, 8, 2};
		int key = 8;
		
		System.out.println("The key is in position " + binary.search(arr, key));
		
		
	}
}
