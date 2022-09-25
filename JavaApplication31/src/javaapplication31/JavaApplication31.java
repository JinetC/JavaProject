/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication31 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the array");
        int n;
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the element");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
      
        System.out.print("array elements are" + Arrays.toString(a));
        
    }
    
}
