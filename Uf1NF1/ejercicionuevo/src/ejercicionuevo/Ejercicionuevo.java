/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionuevo;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicionuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fotos, segundos, segtotales, minutos, segrestantes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas fotos tienes? ");
        fotos = teclado.nextInt();
        System.out.println("Cada cuantos segundos quieres mostrar cada foto? ");
        segundos = teclado.nextInt();
        
        segtotales = fotos*segundos;
        minutos = segtotales/60;
        segrestantes = segtotales%60;
        
        System.out.println("Los minutos que durara la presentacion son " +minutos + " minutos y " +segrestantes + " segundos"); 
    }
    
}
