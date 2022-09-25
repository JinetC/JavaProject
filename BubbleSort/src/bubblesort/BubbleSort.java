
package bubblesort;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    // Java program for implementation of Bubble Sort  
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++){ 
                     int flag = 0;
			for (int j = 0; j < n-i-1; j++){ 
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
                                        
				} 
                        }
           
                        if(flag == 0);
                        break;
                }
	} 

	/* Prints the array */
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BubbleSort ob = new BubbleSort();
                int k = 5000;
                int[] arr = new int[5000];
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
