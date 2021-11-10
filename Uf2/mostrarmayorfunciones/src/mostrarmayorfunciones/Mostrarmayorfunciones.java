/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mostrarmayorfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Mostrarmayorfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2;
        int menor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon un numero");
        numero1 =teclado.nextInt();
        System.out.println("Pon otro numero");
        numero2 =teclado.nextInt();
        menor=mostrarResultado(numero1, numero2);
        System.out.println("El numero mas pequeño es " +menor);
        
    }
    
    public static int mostrarResultado(int numero1, int numero2){
     int menor;
        
        if (numero1<numero2){
         menor=numero1;
     }
        else {
            menor=numero2;
        }
        return menor;
    }
    
}
