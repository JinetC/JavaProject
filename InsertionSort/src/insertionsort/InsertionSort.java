package insertionsort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    
    // Java program for implementation of Insertion Sort 
	/*Function to sort array using insertion sort*/
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int temp = arr[i]; 
			int j = i - 1; 

			while (j >= 0 && arr[j] > temp) { 
				arr[j + 1] = arr[j]; 
				j --; 
			} 
			arr[j + 1] = temp; 
		} 
	} 

	/* A utility function to print array of size n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " \n"); 

		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		//int arr[] = {44,22,77,55,99,83,33}; 

		InsertionSort ob = new InsertionSort(); 
		//ob.sort(arr); 
                int k = 100000;
                int[] arr = new int[100000];
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

		//printArray(arr); 
	} /* This code is contributed by Rajat Mishra. */

    
}
