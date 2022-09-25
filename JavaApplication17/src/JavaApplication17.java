

class SelectionSort 
{ 
    void sort(int apples[]) 
    { 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < 6; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < 6 ; j++) 
                if (apples[j] < apples[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = apples[min_idx]; 
            apples[min_idx] = apples[i]; 
            apples[i] = temp; 
        } 
    } 
  
    // Prints the array 
    void printArray(int apples[]) 
    { 
        int n = apples.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(apples[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int apples[] = {140, 78, 130, 167, 172, 292};
        ob.sort(apples); 
        System.out.println("Sorted array"); 
        ob.printArray(apples); 
    } 
} 