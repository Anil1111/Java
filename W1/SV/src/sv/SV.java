/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sv;

/*
 * @author Abdul-Hakim 
 */

//Finds out the some value 
import java.util.Scanner;

public class SV {

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
        
        int f = a*a*a*a;
        
        int h = x*2;
        
        int v = f+b;
        
        int k = h+c;
        
        int sv = v/k;
        
        System.out.printf("Some value is %s%n", sv);
    }
    
}
