package binarySearch;

public class BinarySearch {
	int iterativeSearch(int[] arr, int key) {
		
		//need to start writing the comments explaining
		
		//just a placeholder
		int index = 0;
		
		//defines the first one in the array
		int first = 0;
		//defines last one in the array
		int last = arr.length - 1;
		//defines the mid point of this array
		int mid = (first + last)/2;
		
		//while	the array is not the size of zero
		while(first <= last) {
			if (arr[mid] < key) {
				//shifts to the right since is greater and we already checked mid
				first = mid + 1;
			}
			//if item in mid make it equal index, break the loop and return at the end
			else if (arr[mid] == key) {
				//define index as mid
				index = mid;
				//print result
				System.out.println("The position of " + key + " is " + index);
				//break from the while loop
				break;
			}
			else {
				//shifts the end point to the left of mid
				//since the value is smaller and we already checked the mid
				last = mid - 1;
			}
			// make new count now with the new value to first or last
			mid = (first + last)/2;
		}
		if (first > last) {
			System.out.println("not found 404");
		}
		//return value
		return index;
	}
	
	int recursiveSearch(int[] arr, int key, int first, int last) {
		
		//just a placeholder
		int index = 0;
		
		int mid = (first + last)/2;
		
		//base case
		if (first > last) {
			return -1;
		}
		
		if(arr[mid] < key) {
			//return recursive but with first being shifted left from mid
			return recursiveSearch(arr,key,mid + 1, last);
		}
		else if (arr[mid] == key) {
			//recursive is gonna end up here at the end
			index = mid;
			//return the value
			return index;
		}
		else {
			//return recursive but with last being shifted right from mid
			return recursiveSearch(arr,key,first, mid - 1);
		}
	}
}
