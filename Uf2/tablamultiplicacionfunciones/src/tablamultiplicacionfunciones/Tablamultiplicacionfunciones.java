/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicacionfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Tablamultiplicacionfunciones {

    private static String tablamultiplicar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Di un numero");
        num=teclado.nextInt();
        tablamultiplicar();
        System.out.println("La tabla es " +tablamultiplicar);

    }
    
    public static void tablamultiplicar(){
    int num=3, contador=1;
            
        for (contador = 1; contador <= 10; contador++) {
            System.out.println(num +"*" + contador + "="+(num*contador));
            
            }
        }
    }
    
