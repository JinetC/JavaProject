package starpattern;

public class StarPattern1 {
 public static void main(String[] args) {
       
    int rc=5, spacecounter=4, starcounter=1;
    
    for(int i=1; i<=5; i++){
        
        System.out.println("");
        
        for(int j=1; j<=spacecounter; j++)
        {
            System.out.print(" ");
        }
        
        for(int k=1; k<=starcounter; k++)
        {
            System.out.print("*");
        }
       spacecounter--;
       starcounter++; 
        
    }
 }
}
