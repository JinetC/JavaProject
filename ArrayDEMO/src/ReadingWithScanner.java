
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ReadingWithScanner {

   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int length = s.nextInt();
      int [] myArray = new int[length];
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<length; i++ ) {
         myArray[i] = s.nextInt();
      }

      System.out.println(Arrays.toString(myArray));
   }
}
    