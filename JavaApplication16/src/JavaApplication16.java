class BubbleSort 
{ 
    void bubbleSort(int apples[]) 
    { 
       
        for (int i = 0; i < 6; i++) 
            for (int j = 0; j < 6-i-1; j++) 
                if (apples[j] > apples[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = apples[j]; 
                    apples[j] = apples[j+1]; 
                    apples[j+1] = temp; 
                } 
    } 
  
    /* Prints the array */
    void printArray(int apples[]) 
    { 
        int n = apples.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(apples[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
         int apples[] = {140, 78, 230, 167, 172, 290}; 
        ob.bubbleSort(apples); 
        System.out.println("Sorted array"); 
        ob.printArray(apples); 
    } 
} 

