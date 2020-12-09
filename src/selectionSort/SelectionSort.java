package selectionSort;

public class SelectionSort {
	int [] sort(int[] arr) {
		int index;
		//looping the unsorted list
		for (int first = 0; first < arr.length; first++) {
			
			//index starts at first but changes in every loop
			index = first;
			
			
			//then every loop the index is compared with all numbers in the list
			for (int i = first + 1; i < arr.length; i++) {
				//check if value is lower
				if (arr[i] < arr[index]) {
					//if it is, change index to it
					index = i;
				}
			}
			
			//holds the value of the minimum we found
			int temp = arr[index];
			//places the value that was in the start at the place we found our index
			arr[index] = arr[first];
			//puts the value from the index in the start
			arr[first] = temp;
		}
		//terminate the loop and return array sorted
		return arr;
		
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
	}
	
}
