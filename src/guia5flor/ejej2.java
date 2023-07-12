/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5flor;

import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class ejej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector. El 
        programa mostrará dónde se encuentra el numero y si se encuentra repetido
         */
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int vec[] = new int[20];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 20);

        }
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);

        }
        System.out.println("que numero desea encontrar?");
        int num = sc.nextInt();

        for (int i = 0; i < vec.length; i++) {
            if (num == vec[i]) {

                System.out.println("el numero se encontro en la posicion " + i);

            }

        }

    }

}
