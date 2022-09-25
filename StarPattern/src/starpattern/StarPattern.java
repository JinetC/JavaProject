/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpattern;

public class StarPattern {
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
        starcounter=starcounter +2;
        
        
    }


        // TODO code application logic here
    }
    
}
