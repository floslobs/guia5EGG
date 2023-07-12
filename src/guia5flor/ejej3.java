/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5flor;

import java.util.Random;

/**
 *
 * @author ARG
 */
public class ejej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
        Random random = new Random();
        int[] vec = new int [20];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = random.nextInt(10000-1+1);
            
        }
       for ( int  i = 0 ; i < vec . length; i ++) {
            System.out.println( vec [ i ] );
        }
        String nPal;    
        int undig=0, dosdig=0, tresdig=0, cuatrodig=0, cincodig = 0;    

        for ( int  i = 0 ; i < vec . length ; i ++) {
            nPal= String.valueOf(vec [ i ]);
            switch ( nPal . length()) {
                case  1 :
                    undig ++;
                    break ;
                case  2 :
                    dosdig += 1 ;
                    break ;
                case 3 :
                    tresdig += 1 ;
                    break ;
                case  4 :
                    cuatrodig += 1 ;
                    break ;
                case  5 :
                    cincodig += 1 ;
                    break ;    
                    
            }  
                    
        }
        
        System.out.println("un digito " +undig);
        System.out.println("dos digitos "+dosdig);
        System.out.println("tres digitos "+tresdig);
        System.out.println("cuatro digitos "+cuatrodig);
        System.out.println("cinco digitos "+cincodig);   
                
    } 
    
}    
    
    
    
    
    
    
    
    
    
    
            
            
            
            

    
