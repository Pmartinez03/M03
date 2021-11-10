/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesquedevuelvenvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Funcionesquedevuelvenvalores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon un valor y lo doblare por 2, luego el resultado lo multiplicaremos por 3");
        int numero =teclado.nextInt();
        int valordoble = doblarNumero(numero);
        System.out.println("numero " +numero + " doble = " +valordoble);
        int valortriple = triplicarNumero(valordoble);
        System.out.println("El resultado es " +valortriple );
    }
    
    /**
     * 
     * @param valor
     * @return 
     */
    public static int doblarNumero(int valor){
     int doble = valor * 2;
     return doble;
     
    }
    public static int triplicarNumero(int valor){
     int triple = valor * 3;
     return triple;
    }
    
}
