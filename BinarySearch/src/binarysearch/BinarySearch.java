
package binarysearch;

public class BinarySearch {
	
	int binarySearch(int arr[], int l, int n, int x) 
	{ 
		int start = 0;
                int end = n;
                
                while(start <= end){
                   int mid = (start + end)/2;
                    
			if (arr[mid] == x) 
				return mid;  
                        else if (arr[mid] > x) 
				return end = mid-1; 

			else
                            return start = mid+1;
		} 

		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 23, 31, 48, 53, 59, 72 }; 
		int n = arr.length; 
		int x = 72; 
		int result = ob.binarySearch(arr, 0, n, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 

 
    
}
