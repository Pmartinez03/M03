/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora, minutos, segundos, segundo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduze una hora");
        hora = teclado.nextInt();
        System.out.println("Introduze los minutos");
        minutos = teclado.nextInt();
        System.out.println("Introduze los segundos");
        segundos = teclado.nextInt();
        segundo = segundos+1;
                    
        if (segundo ==60) {
            System.out.println("La hora es " );
            segundo==0;
            minutos+1;
            
            if(minutos==60){
                minutos=00
                hora+1;
            }
        }
        else {
            System.out.println("La hora nueva es " +hora +":"+minutos + ":" +segundo);
        }
    }
    
}
