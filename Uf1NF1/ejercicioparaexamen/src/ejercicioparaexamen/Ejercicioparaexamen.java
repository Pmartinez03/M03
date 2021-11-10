/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioparaexamen;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicioparaexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este programa se basa en un programa para ahorrar dinero a nuestros jugadores en nuestra tienda de juegos.
        // Aqui dependiendo del dinero que se gasten abra mejores descuentos.
        int dinerogastado, descuento, sueldodescontado;
        Scanner teclado = new Scanner(System.in);
        //Aqui pedimos al usuario cuanto dinero se ha gastado.
        System.out.println("Cuanto dinero te has gastado?");
        dinerogastado= teclado.nextInt();
        
        //Y aqui dependiendo de lo que se haya gastado el cliente tendra mas o menos descuento.
        if (dinerogastado>=80){
            descuento = (dinerogastado*20)/100;
            sueldodescontado = dinerogastado-descuento;
            System.out.println("Tu nuevo precio es " +sueldodescontado);
        }
        else if (dinerogastado<80 && dinerogastado>=50){
            descuento = (dinerogastado*15)/100;
            sueldodescontado = dinerogastado-descuento;
            System.out.println("Tu descuento es " +sueldodescontado);
        }
        else if (dinerogastado<50 && dinerogastado>=25){
            descuento = (dinerogastado*10)/100;
            sueldodescontado = dinerogastado-descuento;
            System.out.println("Tu rebaja es " +sueldodescontado);        
        }
        else {
            descuento = (dinerogastado*0)/100;
            sueldodescontado = dinerogastado-descuento;
            System.out.println("Tu pagas solo " +sueldodescontado);
        }
                
    }
    
}
