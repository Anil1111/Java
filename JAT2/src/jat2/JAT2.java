/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jat2;

/**
 *
 * @author Abdul-Hakim
 */
public class JAT2 {

    /**
     * @param args the command line arguments
     */
        
public static void main(String [] args){
   int x= mystery_one(2,7);
   System.out.println(x);
    
}


            static int mystery_one(int x, int y) {
	int result = 0;
	for( int i = 0; i < x; i++ )
		for( int j = 0; j < y; j += 2 ) {
			result += ( i + 1 )*( j + 2);
	}
	return result;
  }
}
 