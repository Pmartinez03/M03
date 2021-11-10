/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable = 0, exponente = 0, contador, resultado=1;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Pon el valor A ");
        teclado.nextInt();
        System.out.println("Pon el valor B");
        teclado.nextInt();
        for(contador=1;exponente>=contador;exponente++) {
            resultado = resultado*variable;
            System.out.println("Este es el resultado " +resultado);
        }
        System.out.println("Este es el resultado final " +resultado);
    }
    
}
