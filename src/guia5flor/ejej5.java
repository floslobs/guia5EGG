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
public class ejej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. Se 
        dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
        pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
        de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
        
         int [][] mat = new  int [ 4 ][ 4 ];
        // Rellenar la matriz con valores aleatorios
        for ( int  i = 0 ; i < mat . length; i ++) {
            for ( int  j = 0 ; j < mat . length ; j ++) {
                mat[ i ][ j ] = ( int ) ( Math . random () * 10 );
            }
        }
        // Mostrar la matriz original
        System.out.println( "Matriz original:" );
        for ( int  i = 0 ; i < mat . length ; i ++) {
            for ( int  j = 0 ; j < mat . length; j ++) {
                System.out.println ( mat [ i ][ j ] + " " );
            }
            System.out.println();
        }
        // Calcular la traspuesta cambiada de signo
        int [][] trasCaSig = new  int [ 4 ][ 4 ];
        for ( int  i = 0 ; i < mat . length ; i ++) {
            for ( int  j = 0 ; j < mat . length ; j ++) {
                trasCaSig [ j ][ i ] = - mat [ i ][ j ];
            }
        }
        // Mostrar la traspuesta cambiada de signo
        System.out.println( "Traspuesta cambiada de signo:" );
        for ( int  i = 0 ; i < trasCaSig . length ; i ++) {
            for ( int  j = 0 ; j < trasCaSig . length ; j ++) {
                System.out.println( trasCaSig [ i ][ j ] + " " );
            }
            System.out.println();
        }
    }
}
    
    
    

