/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2ordinograma;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio2ordinograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, div1, div2;
        System.out.println("Cuantas monedas tienes? ");
        num= teclado.nextInt();
        
        
        if (num%2==0){
            System.out.println("Numero par");  
        }
        else {
            System.out.println("Numero impar");
        }
        if (num%2==0 && num%3==0){
            System.out.println("Numero par y divisible entre 3");
        }
    }
    
}
