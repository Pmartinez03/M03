/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero 1 ");
        x = teclado.nextInt();
        System.out.println("Numero 2 ");
        y = teclado.nextInt();
        System.out.println("Numero 3");
        z = teclado.nextInt();

        if (x > y & x > z) {
            System.out.println("El mas grande es x " + x);

        } else if (y > x & y > z) {
            System.out.println("El mas grande es y " + y);
        } else {
            System.out.println("El mas grande es z " + z);
        }
    }

}
