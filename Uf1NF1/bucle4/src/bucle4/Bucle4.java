/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, contador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num= teclado.nextInt();
        
        for (contador = 1; contador <=num; contador++) {
            System.out.println(+contador);
    }
   }
}
