
package selectionsort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    // Java program for implementation of Selection Sort
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int iMin = i; 
			for (int j = i+1; j < n; j++) 
                        {
				if (arr[j] < arr[iMin]) 
					iMin = j; 
                        }
			// Swap the found minimum element with the first 
			// element 
                        if (iMin != i) {
                        int temp = arr[i]; 
			arr[i] = arr[iMin]; 
			arr[iMin] = temp; 
                    }
			
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above
/* This code is contributed by Rajat Mishra*/

    
    public static void main(String[] args) {
                
                SelectionSort ob = new SelectionSort(); 
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
        
        
        // TODO code application logic here
    }
    
}
