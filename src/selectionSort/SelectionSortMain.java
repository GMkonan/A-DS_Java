package selectionSort;

public class SelectionSortMain {
	public static void main(String args[]) {
	
	SelectionSort selection = new SelectionSort();
	
	//create the array
	int[] arr = {10, 6, 4, 8, 2};
	
	//This is gonna print the original array
	System.out.println("Unsorted array: ");
	selection.printArray(arr);
	
	//sort the array
	selection.sort(arr);
	
	//used println here just to make a space since we used print in the printArray
	System.out.println();
	
	//print sorted array
	System.out.println("Sorted array: ");
	selection.printArray(arr);
	}
	
}
