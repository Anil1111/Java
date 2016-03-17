/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Using Leibniz's Series

package calculate_pi;

/**
 *
 * @author Abdul-Hakim
 */
import java.util.Scanner;
public class Calculate_PI {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Reader = new Scanner(System.in);
    
    int input;
    
     System.out.print("Enter the number of iterations:");
     input = Reader.nextInt();
     
   
    double output = 0.0;
    boolean positive = true; 
    
    for (int i=0; i<input; i++) { 
        double sum = 4.0/(2.0*((double)i) + 1.0); 
        if (positive) 
        output += sum; 
        else 
            output -= sum; 
            positive = !positive; 
}
        System.out.println("Pi/4 is " + output);
}
}