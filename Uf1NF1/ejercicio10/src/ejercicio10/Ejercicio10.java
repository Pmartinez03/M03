/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, suma, resta, multi, div;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon valor de x ");
        x = teclado.nextInt();
        System.out.println("Pon valor de y ");
        y = teclado.nextInt();
        suma = x+y;
        resta = x-y;
        multi = x*y;
        div = x/y;
        if (x ==0){
        System.out.println("la suma es = " +suma);
        System.out.println("la resta es = " +resta);
        System.out.println("la multiplicación es = " +multi);
        System.out.println("No se puede dividir entre 0");
        }
        else {
        System.out.println("la suma es = " +suma);
        System.out.println("la resta es = " +resta);
        System.out.println("la multiplicación es = " +multi);
        System.out.println("la division es = " +div);
    }
        
    }
    
}
