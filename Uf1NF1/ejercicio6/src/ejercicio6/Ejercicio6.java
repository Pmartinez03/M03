/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precioreal, precioventa, multi, div, desc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Poner precio de venta");
        precioventa = teclado.nextInt();
        System.out.println("Poner precio real");
        precioreal = teclado.nextInt();
        multi = precioventa*100;
        div = multi/precioreal;
        desc = div-100;
        System.out.println("El descuento es " +desc);
        
        
        
                
    }
    
}
