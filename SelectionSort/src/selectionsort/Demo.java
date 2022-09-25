/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;
import java.util.Arrays;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class Demo {
    public static void main(String[] args) {
      int[] arr = new int[1000];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = (int) (i + 20);
      }
      Date past = new Date();
      Arrays.sort(arr);
      Date future = new Date();
      System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
   }
}
