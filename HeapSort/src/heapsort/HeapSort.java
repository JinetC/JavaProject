/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class HeapSort {

	public void sort(int arr[])
	{
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " \n");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		

		HeapSort ob = new HeapSort();
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
	}
}

    
    
  
