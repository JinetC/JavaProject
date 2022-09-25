package telusco1;

import java.util.Random;

public class ArrayDemo4 {
    
    public static void main(String[] args) {
        
        int [] nums = new int[10];
        Random r = new Random();
        for(int i = 0; i< 10; i++){
            
            nums[i]=r.nextInt(50);
        }
        for(int i=0;i<nums.length;i++)
        {
        System.out.println(nums[i]);
        }
    }
}
