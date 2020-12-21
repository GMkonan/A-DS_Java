package binarySearch;

public class BinarySearchMain {
	public static void main(String args[]) {
		BinarySearch binary = new BinarySearch();
		int[] arr = {10, 6, 4, 8, 2};
		int key = 8;
		
		binary.search(arr,key);
		
		int first = 0;
		int last = arr.length - 1;
		
		
		int recursive = binary.recursiveSearch(arr, key, first, last);
		
		if(recursive == -1) {
			System.out.println("Not found 404");
		}
		else {
			System.out.println("Found at position " + recursive);
		}
	}
}
