/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mv;

/*
 * @author Abdul-Hakim
 */
//Finds out the mystery value 
import java.util.Scanner;
public class MV {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int x;
        int c;
        
        System.out.print("Enter the variable a: ");
        a = input.nextInt();
        
        System.out.print("Enter the variable b: ");
        b = input.nextInt();
        
        System.out.print("Enter the variable x: ");
        x = input.nextInt();
        
        System.out.print("Enter the variable c: ");
        c = input.nextInt();
        
        int v = a*a*a*a*a*a*a;
        
        int d = 3*v;
        int p = 5*b;
        int m = 2*x;
        
        int y = d+p;
        int z = y/m;
        
        int mv = z+c;
        
        System.out.printf("The mystery value is %s%n", mv);
        
    }
    
}
