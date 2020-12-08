package selectionSort;

public class SelectionSort {
	int [] sort(int[] arr) {
		int min;
		int index;
		int temp;
		//looping the unsorted list
		for (int first = 0; first < arr.length; first++) {
			
			//first position and minimum value
			min = arr[first];
			//minimum index
			index = first;
			for (int i = first + 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					index = i;
				}
			}
			//holds the value of the minimum we found
			temp = min;
			//places the value that was in the start at the place we found our index
			arr[index] = arr[first];
			//puts the value from the index in the start
			arr[first] = temp;
		}
		return arr;
		
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
	}
	
}
