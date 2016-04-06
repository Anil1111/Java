/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rj2;

/**
 *
 * @author Abdul-Hakim
 */

import java.util.Scanner;

public class RJ2 {

    /**
     * @param args the command line arguments
     */
    
  public static int GCD (int M, int N)
  {
    // Pre : M and N are defined and >= 0
    // Post: Returns the greatest common divisor of M and N.

    int Result;

    if ((N <= M) && (M % N == 0))
    {
      Result = N;                  // stopping case
    }
    else if (M < N)
    {
      Result = GCD(N, M);          // recursion
    }
    else
    {
      Result = GCD(N, M % N);     // recursion
    }
    return Result;
  }

  //Power of a number using recursion
	public int pow(int n, int m){
		if(m==0){
			return 1;
		}else{
			return n*pow(n,m-1);
		}           
	}
  
  public static void main (String[] args)
  {
        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int Num1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int Num2 = scanner.nextInt();
        int n = Num1;
        int m = Num2;
        int d = n*m;
    System.out.println("Their greatest common divisor is: " + GCD(Num1, Num2));
    System.out.println("The power of the integers entered is: " + d);
    
  }
}
