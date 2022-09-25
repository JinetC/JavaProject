package telusco1;

import java.util.Random;

public class ArrayDemo2 
{
    public static void main(String[] args) 
    {
         Random r =new Random();
         int a[]= new int[20];
        // 1 2 3 4 5
        // 0 1 2 3 4
        
       
        
        for(int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt(50);
            
        }
        
        for(int i : a)
        System.out.println(i);
        
    }
    
}
