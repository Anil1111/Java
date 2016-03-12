/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Assignment 2 
 */

package assignment2;

//part a 

/*
 * @author Abdul-Hakim
 */

import java.util.Scanner;

public class Assignment2 {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n, c, fact =1;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
  if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}