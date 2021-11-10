/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon un numero");
        x = teclado.nextInt();
        
        if (x<0){
            System.out.println("Es un numero negativo ");
        }
        else {
            System.out.println("Es un numero positivo " );
        }
        
        }
    }
