/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocerelmayorfunciones;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Conocerelmayorfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2;
        int mayor;
        System.out.println("Pon un valor: ");
        valor1=teclado.nextInt();
        System.out.println("Pon otro valor: ");
        valor2=teclado.nextInt();
        mayor=mostrarResultado(valor1, valor2);
        System.out.println("El numero mas grande que has puesto es " +mayor);
        
    }
    
    public static int mostrarResultado(int valor1, int valor2){
     int mayor;
        
        if (valor1<valor2){
         mayor=valor1;
     }
        else {
            mayor=valor2;
        }
        return mayor;
    }

    
    
    
    
    
}
