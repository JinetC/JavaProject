
package quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			// If current element is smaller than the pivot 
			if (arr[j] < pivot) 
			{ 
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 

	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int pi = partition(arr, low, high); 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" \n"); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		//int arr[] = {10, 7, 8, 9, 1, 5}; 
		//int n = arr.length; 

		QuickSort ob = new QuickSort(); 
		//ob.sort(arr, 0, n-1); 

		//System.out.println("sorted array"); 
		//printArray(arr); 
                int k = 1000;
                int[] arr = new int[1000];
                Random rd = new Random();
                for (int i = 0; i < k; i++) {
                    arr[i] = rd.nextInt(100000);
                  // arr[i] = (int) (i + 20);
                }
                //Date past = new Date();
                long start = System.nanoTime();
                Arrays.sort(arr);
                long end = System.nanoTime();
                //Date future = new Date();
                System.out.println("Time (nanoSeconds) = " + (end - start));
                System.out.println("Sorted array"); 
                ob.printArray(arr);
	} 

}
