/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5flor;

/**
 *
 * @author ARG
 */
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
        y los muestre por pantalla en orden descendente.
*/
        
        int[] vec = new int[100];
        
        for (int i = 0; i < vec.length; i++) {
            
            vec[i] = 100 - i;
           
            System.out.println(vec[i]);
     
            
        }
            
       
        
    }
    
}
