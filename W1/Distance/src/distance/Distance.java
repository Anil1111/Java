/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distance;

/*
 * @author Abdul-Hakim
 */

//Finds out the distance
import java.util.Scanner;

public class Distance {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int rate;
        int time;
        int distance;
        
        System.out.print("Enter the rate: ");
        rate = input.nextInt();
        
        System.out.print("Enter the time spent: ");
        time = input.nextInt();
        
        distance = (rate)*(time);
        
        System.out.printf("The distance is %s%n",distance);
    }
    
}
