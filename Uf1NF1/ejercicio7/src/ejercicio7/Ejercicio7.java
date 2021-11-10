/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, metros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon el valor en millas ");
        x = teclado.nextInt();
        metros= (int) (x*1.852);
        System.out.println("la distancia en metros es = " +metros);
    }
    
}
