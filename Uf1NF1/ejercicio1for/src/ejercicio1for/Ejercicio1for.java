/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1for;

import java.util.Scanner;


/**
 *
 * @author alumne
 */
public class Ejercicio1for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que tabla de multiplicar quieres");
        int tabla = teclado.nextInt();
        for (contador = 1; contador <= 10; contador++) {
            System.out.println(tabla +"*" + contador + "="+(tabla*contador));
            
        }
        System.out.println("Con while");
        contador=1;
        int multi;
        while(contador<=10){
            multi = tabla*contador;
            System.out.println(tabla + "*" + contador + "=" + (tabla*contador));
            contador=contador+1;
        }
        System.out.println("Con do while");
        contador=1;
        do {
            multi = tabla*contador;
            System.out.println(tabla + "*" + contador + "=" + (tabla*contador));
            contador=contador+1; 
        }while (contador<=10);
        
    }
    
}
