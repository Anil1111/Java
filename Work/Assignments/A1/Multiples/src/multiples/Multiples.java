/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

/*
 * @author Abdul-Hakim
 */
import java.util.Scanner;

public class Multiples {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        int n2;
        
         System.out.println("Enter first integer:");
         n1 = input.nextInt();
         System.out.println("Enter second integer:");
         n2 = input.nextInt();
         if (n1 == (n1%n2)){
             System.out.println(n2+" "+"Is a multiple");
         }
         else
             System.out.println("Is not divisable");
         
    }
    
}

