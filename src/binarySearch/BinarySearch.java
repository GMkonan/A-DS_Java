package binarySearch;

public class BinarySearch {
	int search(int[] arr, int key) {
		
		//need to start writing the comments explaining
		
		//just a placeholder
		int index = 0;
		
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last)/2;
		
		while(first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			}
			else if (arr[mid] == key) {
				index = mid;
				break;
			}
			else {
				last = mid - 1;
			}
			// make new count now with the new value to first or last
			mid = (first + last)/2;
		}
		if (first > last) {
			System.out.println("not found 404");
		}
		return index;
	}
}
