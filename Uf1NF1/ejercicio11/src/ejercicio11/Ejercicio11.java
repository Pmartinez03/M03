/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primer numero ");
        x = teclado.nextInt();
        System.out.println("Segundo numero ");
        y = teclado.nextInt();
        
        if (x>y){
            System.out.println("El mas grande es "+x );
        }
        else {
            System.out.println("El mas grande es " +y);
        }
        
        }
    }
    
