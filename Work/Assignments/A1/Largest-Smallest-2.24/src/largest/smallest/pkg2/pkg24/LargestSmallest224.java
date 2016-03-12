/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.smallest.pkg2.pkg24;

/*
 * @author Abdul-Hakim
 */
/*Program requires user to input 5 numbers, 
*and outputs the largest and smallest numbers 
*/
import java.util.Scanner;//uses class Scanner

public class LargestSmallest224 {

    /*
     * @param args the command line arguments
     */
   // main method begins execution of Java application    
    public static void main(String[] args) {
        // TODO code application logic here
      // create a Scanner to obtain input from command window    
        Scanner input = new Scanner( System.in );
        
          int number1; // first integer
          int number2; // second integer
          int number3; // third integer
          int number4; // fourth integer
          int number5; // fifth integer
          
          int largest; // largest number
          int smallest; // smallest number
          
          System.out.print( "Enter first integer: " );//prompt
          number1 = input.nextInt();//read 1st number
          
          System.out.print( "Enter second integer: " ); //prompt
          number2 = input.nextInt(); //read 2nd number
          
          System.out.print( "Enter third integer: " ); //prompt
          number3 = input.nextInt(); //read 3rd number
          
          System.out.print( "Enter fourth integer: " ); //prompt
          number4 = input.nextInt(); //read 4th number
          
          System.out.print( "Enter fifth integer: " ); //prompt
          number5 = input.nextInt(); //read 5th number 
          
           smallest = number1; //declare 
           if ( number2 < smallest ) smallest = number2;
           
           if ( number3 < smallest ) smallest = number3;
           
           if ( number4 < smallest ) smallest = number4;
           
           if ( number5 < smallest ) smallest = number5;
           
           largest = number1; //declare 
           if ( number2 > largest ) largest = number2;
           
           if ( number3 > largest ) largest = number3;
           
           if ( number4 > largest ) largest = number4;
           
           if ( number5 > largest ) largest = number5;
           
           System.out.printf( "Smallest is %d\n", smallest ); //output the smallest number
           
           System.out.printf( "Largest is %d\n", largest ); //output the largest number 
    }
    
}
