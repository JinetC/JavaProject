package telusco2;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int i,count=0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number :");
        
        int n = scan.nextInt();
        
        for(i=1;i<=n;i++){
            
            if(n%i == 0){
                count++;
            }
            if(count == 2){
                System.out.println("Prime number");
                
            }
            else{
                System.out.println("Not Prime number");
            }
        }
    }
    
}
