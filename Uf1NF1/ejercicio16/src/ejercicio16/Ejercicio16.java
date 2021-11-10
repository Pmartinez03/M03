/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduze una nota");
        nota = teclado.nextInt();
        if (nota<3 & nota>=0){
            System.out.println("Nota muy insuficiente");
        }
        else if (nota<5 & nota>=3){
            System.out.println("Nota insuficiente");
        }
        else if (nota<6 & nota>=5){
            System.out.println("Nota Bien");
        }
        else if (nota<9 & nota>=6){
            System.out.println("Nota Notable");
        }
        else if (nota<=10 & nota>=9){
            System.out.println("Nota Excelente");
        }
        else 
            System.out.println("Pon una nota de 0 a 10");
    }
    
}
